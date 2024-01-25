import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class135 {

	@OriginalMember(owner = "client!hca", name = "f", descriptor = "Lclient!on;")
	private Class254 aClass254_7 = null;

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
	private int anInt3417 = 65000;

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "Lclient!on;")
	private Class254 aClass254_8 = null;

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
	private final int anInt3419;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(ILclient!on;Lclient!on;I)V")
	public Class135(@OriginalArg(0) int arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) int arg3) {
		this.anInt3419 = arg0;
		this.aClass254_7 = arg2;
		this.anInt3417 = arg3;
		this.aClass254_8 = arg1;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZI[BI)Z")
	private boolean method2854(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class254 local8 = this.aClass254_8;
		synchronized (this.aClass254_8) {
			try {
				@Pc(68) int local68;
				if (arg1) {
					if ((long) (arg3 * 6 + 6) > this.aClass254_7.method5499()) {
						return false;
					}
					this.aClass254_7.method5500((long) (arg3 * 6));
					this.aClass254_7.method5509(Static194.aByteArray102, 0, 6);
					local68 = ((Static194.aByteArray102[4] & 0xFF) << 8) + (Static194.aByteArray102[3] << 16 & 0xFF0000) + (Static194.aByteArray102[5] & 0xFF);
					if (local68 <= 0 || this.aClass254_8.method5499() / 520L < (long) local68) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass254_8.method5499() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static194.aByteArray102[5] = (byte) local68;
				Static194.aByteArray102[4] = (byte) (local68 >> 8);
				Static194.aByteArray102[3] = (byte) (local68 >> 16);
				Static194.aByteArray102[2] = (byte) arg0;
				Static194.aByteArray102[0] = (byte) (arg0 >> 16);
				Static194.aByteArray102[1] = (byte) (arg0 >> 8);
				this.aClass254_7.method5500((long) (arg3 * 6));
				this.aClass254_7.method5510(6, 0, Static194.aByteArray102);
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				while (local161 < arg0) {
					@Pc(167) int local167 = 0;
					@Pc(202) int local202;
					if (arg1) {
						this.aClass254_8.method5500((long) (local68 * 520));
						try {
							this.aClass254_8.method5509(Static194.aByteArray102, 0, 8);
						} catch (@Pc(186) EOFException local186) {
							return true;
						}
						local202 = (Static194.aByteArray102[1] & 0xFF) + ((Static194.aByteArray102[0] & 0xFF) << 8);
						local167 = (Static194.aByteArray102[6] & 0xFF) + ((Static194.aByteArray102[5] & 0xFF) << 8) + ((Static194.aByteArray102[4] & 0xFF) << 16);
						@Pc(238) int local238 = (Static194.aByteArray102[3] & 0xFF) + ((Static194.aByteArray102[2] & 0xFF) << 8);
						@Pc(244) int local244 = Static194.aByteArray102[7] & 0xFF;
						if (local202 != arg3 || local163 != local238 || this.anInt3419 != local244) {
							return false;
						}
						if (local167 < 0 || this.aClass254_8.method5499() / 520L < (long) local167) {
							return false;
						}
					}
					if (local167 == 0) {
						local167 = (int) ((this.aClass254_8.method5499() + 519L) / 520L);
						arg1 = false;
						if (local167 == 0) {
							local167++;
						}
						if (local68 == local167) {
							local167++;
						}
					}
					Static194.aByteArray102[0] = (byte) (arg3 >> 8);
					if (arg0 - local161 <= 512) {
						local167 = 0;
					}
					Static194.aByteArray102[2] = (byte) (local163 >> 8);
					Static194.aByteArray102[1] = (byte) arg3;
					Static194.aByteArray102[3] = (byte) local163;
					Static194.aByteArray102[5] = (byte) (local167 >> 8);
					Static194.aByteArray102[6] = (byte) local167;
					Static194.aByteArray102[4] = (byte) (local167 >> 16);
					Static194.aByteArray102[7] = (byte) this.anInt3419;
					this.aClass254_8.method5500((long) (local68 * 520));
					this.aClass254_8.method5510(8, 0, Static194.aByteArray102);
					local202 = arg0 - local161;
					if (local202 > 512) {
						local202 = 512;
					}
					this.aClass254_8.method5510(local202, local161, arg2);
					local161 += local202;
					local163++;
					local68 = local167;
				}
				return true;
			} catch (@Pc(430) IOException local430) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BI)[B")
	public byte[] method2855(@OriginalArg(1) int arg0) {
		@Pc(8) Class254 local8 = this.aClass254_8;
		synchronized (this.aClass254_8) {
			try {
				if (this.aClass254_7.method5499() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass254_7.method5500((long) (arg0 * 6));
				this.aClass254_7.method5509(Static194.aByteArray102, 0, 6);
				@Pc(69) int local69 = ((Static194.aByteArray102[1] & 0xFF) << 8) + (Static194.aByteArray102[0] << 16 & 0xFF0000) + (Static194.aByteArray102[2] & 0xFF);
				@Pc(91) int local91 = ((Static194.aByteArray102[3] & 0xFF) << 16) + (Static194.aByteArray102[4] << 8 & 0xFF00) + (Static194.aByteArray102[5] & 0xFF);
				if (local69 < 0 || local69 > this.anInt3417) {
					return null;
				} else if (local91 > 0 && this.aClass254_8.method5499() / 520L >= (long) local91) {
					@Pc(136) byte[] local136 = new byte[local69];
					@Pc(138) int local138 = 0;
					@Pc(140) int local140 = 0;
					label55: while (local138 < local69) {
						if (local91 == 0) {
							return null;
						}
						this.aClass254_8.method5500((long) (local91 * 520));
						@Pc(162) int local162 = local69 - local138;
						if (local162 > 512) {
							local162 = 512;
						}
						this.aClass254_8.method5509(Static194.aByteArray102, 0, local162 + 8);
						@Pc(193) int local193 = ((Static194.aByteArray102[0] & 0xFF) << 8) + (Static194.aByteArray102[1] & 0xFF);
						@Pc(207) int local207 = ((Static194.aByteArray102[2] & 0xFF) << 8) + (Static194.aByteArray102[3] & 0xFF);
						@Pc(230) int local230 = ((Static194.aByteArray102[4] & 0xFF) << 16) - (-(Static194.aByteArray102[5] << 8 & 0xFF00) - (Static194.aByteArray102[6] & 0xFF));
						@Pc(236) int local236 = Static194.aByteArray102[7] & 0xFF;
						if (local193 == arg0 && local140 == local207 && local236 == this.anInt3419) {
							if (local230 >= 0 && this.aClass254_8.method5499() / 520L >= (long) local230) {
								local140++;
								local91 = local230;
								@Pc(290) int local290 = 0;
								while (true) {
									if (local162 <= local290) {
										continue label55;
									}
									local136[local138++] = Static194.aByteArray102[local290 + 8];
									local290++;
								}
							}
							return null;
						}
						return null;
					}
					return local136;
				} else {
					return null;
				}
			} catch (@Pc(319) IOException local319) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3419;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[BI)Z")
	public boolean method2857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class254 local6 = this.aClass254_8;
		synchronized (this.aClass254_8) {
			if (arg1 < 0 || arg1 > this.anInt3417) {
				throw new IllegalArgumentException();
			}
			@Pc(42) boolean local42 = this.method2854(arg1, true, arg2, arg0);
			if (!local42) {
				local42 = this.method2854(arg1, false, arg2, arg0);
			}
			return local42;
		}
	}
}
