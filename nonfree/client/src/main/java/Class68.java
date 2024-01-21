import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class68 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt2756 = 65000;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Lclient!aa;")
	private Class2 aClass2_3 = null;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "Lclient!aa;")
	private Class2 aClass2_4 = null;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private final int anInt2757;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(ILclient!aa;Lclient!aa;I)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) Class2 arg2, @OriginalArg(3) int arg3) {
		this.anInt2757 = arg0;
		this.aClass2_3 = arg2;
		this.aClass2_4 = arg1;
		this.anInt2756 = arg3;
	}

	@OriginalMember(owner = "client!t", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2757;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B[BIIZ)Z")
	private boolean method1897(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(13) Class2 local13 = this.aClass2_4;
		synchronized (this.aClass2_4) {
			try {
				@Pc(76) int local76;
				if (arg3) {
					if (this.aClass2_3.method12() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass2_3.method20((long) (arg2 * 6));
					this.aClass2_3.method17(0, Static17.aByteArray10, 6);
					local76 = ((Static17.aByteArray10[3] & 0xFF) << 16) + (Static17.aByteArray10[4] << 8 & 0xFF00) + (Static17.aByteArray10[5] & 0xFF);
					if (local76 <= 0 || (long) local76 > this.aClass2_4.method12() / 520L) {
						return false;
					}
				} else {
					local76 = (int) ((this.aClass2_4.method12() + 519L) / 520L);
					if (local76 == 0) {
						local76 = 1;
					}
				}
				Static17.aByteArray10[0] = (byte) (arg1 >> 16);
				Static17.aByteArray10[1] = (byte) (arg1 >> 8);
				Static17.aByteArray10[5] = (byte) local76;
				Static17.aByteArray10[4] = (byte) (local76 >> 8);
				Static17.aByteArray10[3] = (byte) (local76 >> 16);
				@Pc(150) int local150 = 0;
				@Pc(152) int local152 = 0;
				Static17.aByteArray10[2] = (byte) arg1;
				this.aClass2_3.method20((long) (arg2 * 6));
				this.aClass2_3.method10(0, 6, Static17.aByteArray10);
				while (arg1 > local152) {
					@Pc(176) int local176 = 0;
					@Pc(211) int local211;
					if (arg3) {
						this.aClass2_4.method20((long) (local76 * 520));
						try {
							this.aClass2_4.method17(0, Static17.aByteArray10, 8);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local211 = (Static17.aByteArray10[1] & 0xFF) + ((Static17.aByteArray10[0] & 0xFF) << 8);
						@Pc(226) int local226 = ((Static17.aByteArray10[2] & 0xFF) << 8) + (Static17.aByteArray10[3] & 0xFF);
						local176 = ((Static17.aByteArray10[5] & 0xFF) << 8) + ((Static17.aByteArray10[4] & 0xFF) << 16) + (Static17.aByteArray10[6] & 0xFF);
						@Pc(254) int local254 = Static17.aByteArray10[7] & 0xFF;
						if (local211 != arg2 || local150 != local226 || this.anInt2757 != local254) {
							return false;
						}
						if (local176 < 0 || (long) local176 > this.aClass2_4.method12() / 520L) {
							return false;
						}
					}
					if (local176 == 0) {
						arg3 = false;
						local176 = (int) ((this.aClass2_4.method12() + 519L) / 520L);
						if (local176 == 0) {
							local176++;
						}
						if (local76 == local176) {
							local176++;
						}
					}
					local211 = arg1 - local152;
					Static17.aByteArray10[7] = (byte) this.anInt2757;
					if (local211 > 512) {
						local211 = 512;
					}
					Static17.aByteArray10[2] = (byte) (local150 >> 8);
					Static17.aByteArray10[3] = (byte) local150;
					Static17.aByteArray10[1] = (byte) arg2;
					if (arg1 - local152 <= 512) {
						local176 = 0;
					}
					Static17.aByteArray10[4] = (byte) (local176 >> 16);
					Static17.aByteArray10[5] = (byte) (local176 >> 8);
					Static17.aByteArray10[6] = (byte) local176;
					Static17.aByteArray10[0] = (byte) (arg2 >> 8);
					this.aClass2_4.method20((long) (local76 * 520));
					this.aClass2_4.method10(0, 8, Static17.aByteArray10);
					local150++;
					local76 = local176;
					this.aClass2_4.method10(local152, local211, arg0);
					local152 += local211;
				}
				return true;
			} catch (@Pc(440) IOException local440) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI[BI)Z")
	public boolean method1898(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2 local6 = this.aClass2_4;
		synchronized (this.aClass2_4) {
			if (arg2 < 0 || this.anInt2756 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method1897(arg1, arg2, arg0, true);
			if (!local38) {
				local38 = this.method1897(arg1, arg2, arg0, false);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)[B")
	public byte[] method1899(@OriginalArg(1) int arg0) {
		@Pc(8) Class2 local8 = this.aClass2_4;
		synchronized (this.aClass2_4) {
			try {
				if (this.aClass2_3.method12() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass2_3.method20((long) (arg0 * 6));
				this.aClass2_3.method17(0, Static17.aByteArray10, 6);
				@Pc(65) int local65 = (Static17.aByteArray10[2] & 0xFF) + ((Static17.aByteArray10[1] & 0xFF) << 8) + ((Static17.aByteArray10[0] & 0xFF) << 16);
				@Pc(87) int local87 = (Static17.aByteArray10[5] & 0xFF) + ((Static17.aByteArray10[4] & 0xFF) << 8) + ((Static17.aByteArray10[3] & 0xFF) << 16);
				if (local65 < 0 || local65 > this.anInt2756) {
					return null;
				} else if (local87 > 0 && this.aClass2_4.method12() / 520L >= (long) local87) {
					@Pc(127) byte[] local127 = new byte[local65];
					@Pc(129) int local129 = 0;
					@Pc(131) int local131 = 0;
					while (local65 > local129) {
						if (local87 == 0) {
							return null;
						}
						this.aClass2_4.method20((long) (local87 * 520));
						@Pc(154) int local154 = local65 - local129;
						if (local154 > 512) {
							local154 = 512;
						}
						this.aClass2_4.method17(0, Static17.aByteArray10, local154 + 8);
						@Pc(184) int local184 = (Static17.aByteArray10[1] & 0xFF) + ((Static17.aByteArray10[0] & 0xFF) << 8);
						@Pc(198) int local198 = (Static17.aByteArray10[3] & 0xFF) + ((Static17.aByteArray10[2] & 0xFF) << 8);
						@Pc(220) int local220 = ((Static17.aByteArray10[5] & 0xFF) << 8) + ((Static17.aByteArray10[4] & 0xFF) << 16) + (Static17.aByteArray10[6] & 0xFF);
						@Pc(226) int local226 = Static17.aByteArray10[7] & 0xFF;
						if (arg0 == local184 && local198 == local131 && this.anInt2757 == local226) {
							if (local220 >= 0 && this.aClass2_4.method12() / 520L >= (long) local220) {
								local87 = local220;
								for (@Pc(275) int local275 = 0; local275 < local154; local275++) {
									local127[local129++] = Static17.aByteArray10[local275 + 8];
								}
								local131++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local127;
				} else {
					return null;
				}
			} catch (@Pc(305) IOException local305) {
				return null;
			}
		}
	}
}
