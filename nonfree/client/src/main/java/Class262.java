import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class262 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	private int anInt7750 = 65000;

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "Lclient!bda;")
	private Class31 aClass31_5 = null;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "Lclient!bda;")
	private Class31 aClass31_6 = null;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	private final int anInt7757;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(ILclient!bda;Lclient!bda;I)V")
	public Class262(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int arg3) {
		this.anInt7750 = arg3;
		this.anInt7757 = arg0;
		this.aClass31_5 = arg1;
		this.aClass31_6 = arg2;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([BIBI)Z")
	public boolean method6492(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class31 local14 = this.aClass31_5;
		synchronized (this.aClass31_5) {
			if (arg2 < 0 || arg2 > this.anInt7750) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method6496(arg0, arg2, arg1, true);
			if (!local37) {
				local37 = this.method6496(arg0, arg2, arg1, false);
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)[B")
	public byte[] method6494(@OriginalArg(1) int arg0) {
		@Pc(6) Class31 local6 = this.aClass31_5;
		synchronized (this.aClass31_5) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass31_6.method751()) {
					return null;
				}
				this.aClass31_6.method755((long) (arg0 * 6));
				this.aClass31_6.method760(6, 0, Static474.aByteArray75);
				@Pc(67) int local67 = (Static474.aByteArray75[2] & 0xFF) + ((Static474.aByteArray75[1] & 0xFF) << 8) + ((Static474.aByteArray75[0] & 0xFF) << 16);
				@Pc(97) int local97 = ((Static474.aByteArray75[3] & 0xFF) << 16) + ((Static474.aByteArray75[4] & 0xFF) << 8) + (Static474.aByteArray75[5] & 0xFF);
				if (local67 < 0 || local67 > this.anInt7750) {
					return null;
				} else if (local97 > 0 && this.aClass31_5.method751() / 520L >= (long) local97) {
					@Pc(141) byte[] local141 = new byte[local67];
					@Pc(143) int local143 = 0;
					@Pc(145) int local145 = 0;
					while (local143 < local67) {
						if (local97 == 0) {
							return null;
						}
						this.aClass31_5.method755((long) (local97 * 520));
						@Pc(170) int local170 = local67 - local143;
						if (local170 > 512) {
							local170 = 512;
						}
						this.aClass31_5.method760(local170 + 8, 0, Static474.aByteArray75);
						@Pc(198) int local198 = (Static474.aByteArray75[1] & 0xFF) + ((Static474.aByteArray75[0] & 0xFF) << 8);
						@Pc(212) int local212 = (Static474.aByteArray75[3] & 0xFF) + ((Static474.aByteArray75[2] & 0xFF) << 8);
						@Pc(235) int local235 = ((Static474.aByteArray75[4] & 0xFF) << 16) - (-((Static474.aByteArray75[5] & 0xFF) << 8) - (Static474.aByteArray75[6] & 0xFF));
						@Pc(241) int local241 = Static474.aByteArray75[7] & 0xFF;
						if (local198 == arg0 && local145 == local212 && this.anInt7757 == local241) {
							if (local235 >= 0 && (long) local235 <= this.aClass31_5.method751() / 520L) {
								local97 = local235;
								for (@Pc(290) int local290 = 0; local290 < local170; local290++) {
									local141[local143++] = Static474.aByteArray75[local290 + 8];
								}
								local145++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local141;
				} else {
					return null;
				}
			} catch (@Pc(319) IOException local319) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([BIBIZ)Z")
	private boolean method6496(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class31 local8 = this.aClass31_5;
		synchronized (this.aClass31_5) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if (this.aClass31_6.method751() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass31_6.method755((long) (arg2 * 6));
					this.aClass31_6.method760(6, 0, Static474.aByteArray75);
					local22 = (Static474.aByteArray75[5] & 0xFF) + ((Static474.aByteArray75[3] & 0xFF) << 16) + ((Static474.aByteArray75[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass31_5.method751() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass31_5.method751() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static474.aByteArray75[5] = (byte) local22;
				Static474.aByteArray75[1] = (byte) (arg1 >> 8);
				Static474.aByteArray75[2] = (byte) arg1;
				Static474.aByteArray75[3] = (byte) (local22 >> 16);
				Static474.aByteArray75[4] = (byte) (local22 >> 8);
				Static474.aByteArray75[0] = (byte) (arg1 >> 16);
				this.aClass31_6.method755((long) (arg2 * 6));
				this.aClass31_6.method759(0, 6, Static474.aByteArray75);
				@Pc(176) int local176 = 0;
				@Pc(178) int local178 = 0;
				while (arg1 > local176) {
					@Pc(182) int local182 = 0;
					@Pc(217) int local217;
					if (arg3) {
						this.aClass31_5.method755((long) (local22 * 520));
						try {
							this.aClass31_5.method760(8, 0, Static474.aByteArray75);
						} catch (@Pc(201) EOFException local201) {
							return true;
						}
						local217 = ((Static474.aByteArray75[0] & 0xFF) << 8) + (Static474.aByteArray75[1] & 0xFF);
						local182 = (Static474.aByteArray75[6] & 0xFF) + ((Static474.aByteArray75[5] & 0xFF) << 8) + ((Static474.aByteArray75[4] & 0xFF) << 16);
						@Pc(253) int local253 = (Static474.aByteArray75[3] & 0xFF) + ((Static474.aByteArray75[2] & 0xFF) << 8);
						@Pc(259) int local259 = Static474.aByteArray75[7] & 0xFF;
						if (arg2 != local217 || local178 != local253 || local259 != this.anInt7757) {
							return false;
						}
						if (local182 < 0 || this.aClass31_5.method751() / 520L < (long) local182) {
							return false;
						}
					}
					if (local182 == 0) {
						local182 = (int) ((this.aClass31_5.method751() + 519L) / 520L);
						arg3 = false;
						if (local182 == 0) {
							local182++;
						}
						if (local22 == local182) {
							local182++;
						}
					}
					if (arg1 - local176 <= 512) {
						local182 = 0;
					}
					Static474.aByteArray75[0] = (byte) (arg2 >> 8);
					Static474.aByteArray75[1] = (byte) arg2;
					Static474.aByteArray75[2] = (byte) (local178 >> 8);
					Static474.aByteArray75[3] = (byte) local178;
					Static474.aByteArray75[5] = (byte) (local182 >> 8);
					Static474.aByteArray75[7] = (byte) this.anInt7757;
					Static474.aByteArray75[4] = (byte) (local182 >> 16);
					Static474.aByteArray75[6] = (byte) local182;
					this.aClass31_5.method755((long) (local22 * 520));
					this.aClass31_5.method759(0, 8, Static474.aByteArray75);
					local217 = arg1 - local176;
					if (local217 > 512) {
						local217 = 512;
					}
					this.aClass31_5.method759(local176, local217, arg0);
					local178++;
					local176 += local217;
					local22 = local182;
				}
				return true;
			} catch (@Pc(448) IOException local448) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt7757;
	}
}
