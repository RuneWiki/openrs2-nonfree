import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class71 {

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	private int anInt3096 = 65000;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!ae;")
	private Class5 aClass5_13 = null;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!ae;")
	private Class5 aClass5_12 = null;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	private int anInt3095;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILclient!ae;Lclient!ae;I)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3) {
		this.anInt3096 = arg3;
		this.aClass5_12 = arg2;
		this.aClass5_13 = arg1;
		this.anInt3095 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIBI)Z")
	public boolean method2350(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5 local6 = this.aClass5_13;
		synchronized (this.aClass5_13) {
			if (arg2 < 0 || this.anInt3096 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method2354(arg1, arg0, arg2, true);
			if (!local31) {
				local31 = this.method2354(arg1, arg0, arg2, false);
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)[B")
	public byte[] method2351(@OriginalArg(0) int arg0) {
		@Pc(8) Class5 local8 = this.aClass5_13;
		synchronized (this.aClass5_13) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass5_12.method87()) {
					return null;
				}
				this.aClass5_12.method90((long) (arg0 * 6));
				this.aClass5_12.method89(6, Static259.aByteArray64, 0);
				@Pc(69) int local69 = (Static259.aByteArray64[5] & 0xFF) + ((Static259.aByteArray64[3] & 0xFF) << 16) + ((Static259.aByteArray64[4] & 0xFF) << 8);
				@Pc(92) int local92 = ((Static259.aByteArray64[1] & 0xFF) << 8) + ((Static259.aByteArray64[0] & 0xFF) << 16) + (Static259.aByteArray64[2] & 0xFF);
				if (local92 < 0 || this.anInt3096 < local92) {
					return null;
				} else if (local69 > 0 && this.aClass5_13.method87() / 520L >= (long) local69) {
					@Pc(140) int local140 = 0;
					@Pc(143) byte[] local143 = new byte[local92];
					@Pc(145) int local145 = 0;
					while (local92 > local140) {
						if (local69 == 0) {
							return null;
						}
						this.aClass5_13.method90((long) (local69 * 520));
						@Pc(170) int local170 = local92 - local140;
						if (local170 > 512) {
							local170 = 512;
						}
						this.aClass5_13.method89(local170 + 8, Static259.aByteArray64, 0);
						@Pc(200) int local200 = (Static259.aByteArray64[3] & 0xFF) + ((Static259.aByteArray64[2] & 0xFF) << 8);
						@Pc(215) int local215 = ((Static259.aByteArray64[0] & 0xFF) << 8) + (Static259.aByteArray64[1] & 0xFF);
						@Pc(237) int local237 = ((Static259.aByteArray64[5] & 0xFF) << 8) + (Static259.aByteArray64[4] << 16 & 0xFF0000) + (Static259.aByteArray64[6] & 0xFF);
						@Pc(243) int local243 = Static259.aByteArray64[7] & 0xFF;
						if (arg0 == local215 && local200 == local145 && local243 == this.anInt3095) {
							if (local237 >= 0 && (long) local237 <= this.aClass5_13.method87() / 520L) {
								for (@Pc(286) int local286 = 0; local286 < local170; local286++) {
									local143[local140++] = Static259.aByteArray64[local286 + 8];
								}
								local145++;
								local69 = local237;
								continue;
							}
							return null;
						}
						return null;
					}
					return local143;
				} else {
					return null;
				}
			} catch (@Pc(318) IOException local318) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3095;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BIZ)Z")
	private boolean method2354(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class5 local8 = this.aClass5_13;
		synchronized (this.aClass5_13) {
			try {
				@Pc(76) int local76;
				if (arg3) {
					if ((long) (arg0 * 6 + 6) > this.aClass5_12.method87()) {
						return false;
					}
					this.aClass5_12.method90((long) (arg0 * 6));
					this.aClass5_12.method89(6, Static259.aByteArray64, 0);
					local76 = ((Static259.aByteArray64[4] & 0xFF) << 8) + (Static259.aByteArray64[3] << 16 & 0xFF0000) + (Static259.aByteArray64[5] & 0xFF);
					if (local76 <= 0 || (long) local76 > this.aClass5_13.method87() / 520L) {
						return false;
					}
				} else {
					local76 = (int) ((this.aClass5_13.method87() + 519L) / 520L);
					if (local76 == 0) {
						local76 = 1;
					}
				}
				Static259.aByteArray64[5] = (byte) local76;
				Static259.aByteArray64[3] = (byte) (local76 >> 16);
				Static259.aByteArray64[4] = (byte) (local76 >> 8);
				@Pc(136) int local136 = 0;
				Static259.aByteArray64[2] = (byte) arg2;
				Static259.aByteArray64[0] = (byte) (arg2 >> 16);
				Static259.aByteArray64[1] = (byte) (arg2 >> 8);
				@Pc(157) int local157 = 0;
				this.aClass5_12.method90((long) (arg0 * 6));
				this.aClass5_12.method85(0, 6, Static259.aByteArray64);
				while (arg2 > local157) {
					@Pc(176) int local176 = 0;
					@Pc(252) int local252;
					if (arg3) {
						this.aClass5_13.method90((long) (local76 * 520));
						try {
							this.aClass5_13.method89(8, Static259.aByteArray64, 0);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local176 = ((Static259.aByteArray64[5] & 0xFF) << 8) + (Static259.aByteArray64[4] << 16 & 0xFF0000) + (Static259.aByteArray64[6] & 0xFF);
						@Pc(237) int local237 = ((Static259.aByteArray64[2] & 0xFF) << 8) + (Static259.aByteArray64[3] & 0xFF);
						local252 = ((Static259.aByteArray64[0] & 0xFF) << 8) + (Static259.aByteArray64[1] & 0xFF);
						@Pc(258) int local258 = Static259.aByteArray64[7] & 0xFF;
						if (arg0 != local252 || local136 != local237 || local258 != this.anInt3095) {
							return false;
						}
						if (local176 < 0 || this.aClass5_13.method87() / 520L < (long) local176) {
							return false;
						}
					}
					if (local176 == 0) {
						local176 = (int) ((this.aClass5_13.method87() + 519L) / 520L);
						arg3 = false;
						if (local176 == 0) {
							local176++;
						}
						if (local76 == local176) {
							local176++;
						}
					}
					Static259.aByteArray64[3] = (byte) local136;
					Static259.aByteArray64[2] = (byte) (local136 >> 8);
					Static259.aByteArray64[7] = (byte) this.anInt3095;
					local136++;
					local252 = arg2 - local157;
					if (arg2 - local157 <= 512) {
						local176 = 0;
					}
					if (local252 > 512) {
						local252 = 512;
					}
					Static259.aByteArray64[1] = (byte) arg0;
					Static259.aByteArray64[5] = (byte) (local176 >> 8);
					Static259.aByteArray64[4] = (byte) (local176 >> 16);
					Static259.aByteArray64[0] = (byte) (arg0 >> 8);
					Static259.aByteArray64[6] = (byte) local176;
					this.aClass5_13.method90((long) (local76 * 520));
					local76 = local176;
					this.aClass5_13.method85(0, 8, Static259.aByteArray64);
					this.aClass5_13.method85(local157, local252, arg1);
					local157 += local252;
				}
				return true;
			} catch (@Pc(439) IOException local439) {
				return false;
			}
		}
	}
}
