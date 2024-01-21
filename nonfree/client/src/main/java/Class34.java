import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class34 {

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Lclient!dd;")
	private Class19 aClass19_1 = null;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Lclient!dd;")
	private Class19 aClass19_2 = null;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
	private int anInt1536 = 65000;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
	private final int anInt1538;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ILclient!dd;Lclient!dd;I)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3) {
		this.anInt1538 = arg0;
		this.anInt1536 = arg3;
		this.aClass19_2 = arg1;
		this.aClass19_1 = arg2;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([BIBI)Z")
	public boolean method1211(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class19 local6 = this.aClass19_2;
		synchronized (this.aClass19_2) {
			if (arg2 < 0 || arg2 > this.anInt1536) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method1213(true, arg0, arg2, arg1);
			if (!local31) {
				local31 = this.method1213(false, arg0, arg2, arg1);
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!gg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1538;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI[BII)Z")
	private boolean method1213(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class19 local8 = this.aClass19_2;
		synchronized (this.aClass19_2) {
			try {
				@Pc(67) int local67;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass19_1.method755()) {
						return false;
					}
					this.aClass19_1.method754((long) (arg3 * 6));
					this.aClass19_1.method756(6, 0, Static20.aByteArray7);
					local67 = ((Static20.aByteArray7[4] & 0xFF) << 8) + ((Static20.aByteArray7[3] & 0xFF) << 16) + (Static20.aByteArray7[5] & 0xFF);
					if (local67 <= 0 || this.aClass19_2.method755() / 520L < (long) local67) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass19_2.method755() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static20.aByteArray7[3] = (byte) (local67 >> 16);
				Static20.aByteArray7[5] = (byte) local67;
				Static20.aByteArray7[0] = (byte) (arg2 >> 16);
				Static20.aByteArray7[4] = (byte) (local67 >> 8);
				Static20.aByteArray7[2] = (byte) arg2;
				@Pc(135) int local135 = 0;
				@Pc(137) int local137 = 0;
				Static20.aByteArray7[1] = (byte) (arg2 >> 8);
				this.aClass19_1.method754((long) (arg3 * 6));
				this.aClass19_1.method751(Static20.aByteArray7, 0, 6);
				while (arg2 > local135) {
					@Pc(170) int local170 = 0;
					@Pc(228) int local228;
					if (arg0) {
						this.aClass19_2.method754((long) (local67 * 520));
						try {
							this.aClass19_2.method756(8, 0, Static20.aByteArray7);
						} catch (@Pc(189) EOFException local189) {
							return true;
						}
						local170 = ((Static20.aByteArray7[5] & 0xFF) << 8) + ((Static20.aByteArray7[4] & 0xFF) << 16) + (Static20.aByteArray7[6] & 0xFF);
						local228 = ((Static20.aByteArray7[0] & 0xFF) << 8) + (Static20.aByteArray7[1] & 0xFF);
						@Pc(242) int local242 = (Static20.aByteArray7[3] & 0xFF) + ((Static20.aByteArray7[2] & 0xFF) << 8);
						@Pc(248) int local248 = Static20.aByteArray7[7] & 0xFF;
						if (arg3 != local228 || local137 != local242 || this.anInt1538 != local248) {
							return false;
						}
						if (local170 < 0 || (long) local170 > this.aClass19_2.method755() / 520L) {
							return false;
						}
					}
					if (local170 == 0) {
						local170 = (int) ((this.aClass19_2.method755() + 519L) / 520L);
						arg0 = false;
						if (local170 == 0) {
							local170++;
						}
						if (local67 == local170) {
							local170++;
						}
					}
					Static20.aByteArray7[1] = (byte) arg3;
					Static20.aByteArray7[7] = (byte) this.anInt1538;
					Static20.aByteArray7[0] = (byte) (arg3 >> 8);
					Static20.aByteArray7[3] = (byte) local137;
					if (arg2 - local135 <= 512) {
						local170 = 0;
					}
					Static20.aByteArray7[4] = (byte) (local170 >> 16);
					local228 = arg2 - local135;
					Static20.aByteArray7[2] = (byte) (local137 >> 8);
					Static20.aByteArray7[6] = (byte) local170;
					local137++;
					Static20.aByteArray7[5] = (byte) (local170 >> 8);
					if (local228 > 512) {
						local228 = 512;
					}
					this.aClass19_2.method754((long) (local67 * 520));
					this.aClass19_2.method751(Static20.aByteArray7, 0, 8);
					this.aClass19_2.method751(arg1, local135, local228);
					local135 += local228;
					local67 = local170;
				}
				return true;
			} catch (@Pc(426) IOException local426) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[B")
	public byte[] method1214(@OriginalArg(1) int arg0) {
		@Pc(6) Class19 local6 = this.aClass19_2;
		synchronized (this.aClass19_2) {
			try {
				if (this.aClass19_1.method755() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass19_1.method754((long) (arg0 * 6));
				this.aClass19_1.method756(6, 0, Static20.aByteArray7);
				@Pc(64) int local64 = ((Static20.aByteArray7[4] & 0xFF) << 8) + ((Static20.aByteArray7[3] & 0xFF) << 16) + (Static20.aByteArray7[5] & 0xFF);
				@Pc(87) int local87 = ((Static20.aByteArray7[0] & 0xFF) << 16) + ((Static20.aByteArray7[1] & 0xFF) << 8) + (Static20.aByteArray7[2] & 0xFF);
				if (local87 < 0 || this.anInt1536 < local87) {
					return null;
				} else if (local64 > 0 && (long) local64 <= this.aClass19_2.method755() / 520L) {
					@Pc(128) byte[] local128 = new byte[local87];
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					label55: while (local141 < local87) {
						if (local64 == 0) {
							return null;
						}
						this.aClass19_2.method754((long) (local64 * 520));
						@Pc(163) int local163 = local87 - local141;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass19_2.method756(local163 + 8, 0, Static20.aByteArray7);
						@Pc(194) int local194 = ((Static20.aByteArray7[0] & 0xFF) << 8) + (Static20.aByteArray7[1] & 0xFF);
						@Pc(200) int local200 = Static20.aByteArray7[7] & 0xFF;
						@Pc(215) int local215 = ((Static20.aByteArray7[2] & 0xFF) << 8) + (Static20.aByteArray7[3] & 0xFF);
						@Pc(239) int local239 = ((Static20.aByteArray7[4] & 0xFF) << 16) - (-((Static20.aByteArray7[5] & 0xFF) << 8) - (Static20.aByteArray7[6] & 0xFF));
						if (arg0 == local194 && local139 == local215 && local200 == this.anInt1538) {
							if (local239 >= 0 && this.aClass19_2.method755() / 520L >= (long) local239) {
								local139++;
								local64 = local239;
								@Pc(290) int local290 = 0;
								while (true) {
									if (local163 <= local290) {
										continue label55;
									}
									local128[local141++] = Static20.aByteArray7[local290 + 8];
									local290++;
								}
							}
							return null;
						}
						return null;
					}
					return local128;
				} else {
					return null;
				}
			} catch (@Pc(322) IOException local322) {
				return null;
			}
		}
	}
}
