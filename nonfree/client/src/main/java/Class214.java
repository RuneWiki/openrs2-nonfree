import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class214 {

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!up;")
	private Class205 aClass205_3 = null;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!up;")
	private Class205 aClass205_4 = null;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	private int anInt6584 = 65000;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	private final int anInt6577;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(ILclient!up;Lclient!up;I)V")
	public Class214(@OriginalArg(0) int arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) int arg3) {
		this.anInt6584 = arg3;
		this.aClass205_4 = arg2;
		this.anInt6577 = arg0;
		this.aClass205_3 = arg1;
	}

	@OriginalMember(owner = "client!we", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6577;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[BZII)Z")
	private boolean method5525(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class205 local14 = this.aClass205_3;
		synchronized (this.aClass205_3) {
			try {
				@Pc(28) int local28;
				if (arg0) {
					if ((long) (arg3 * 6 + 6) > this.aClass205_4.method5316()) {
						return false;
					}
					this.aClass205_4.method5309((long) (arg3 * 6));
					this.aClass205_4.method5320(0, Static156.aByteArray78, 6);
					local28 = (Static156.aByteArray78[5] & 0xFF) + ((Static156.aByteArray78[3] & 0xFF) << 16) + ((Static156.aByteArray78[4] & 0xFF) << 8);
					if (local28 <= 0 || this.aClass205_3.method5316() / 520L < (long) local28) {
						return false;
					}
				} else {
					local28 = (int) ((this.aClass205_3.method5316() + 519L) / 520L);
					if (local28 == 0) {
						local28 = 1;
					}
				}
				Static156.aByteArray78[3] = (byte) (local28 >> 16);
				Static156.aByteArray78[1] = (byte) (arg2 >> 8);
				Static156.aByteArray78[0] = (byte) (arg2 >> 16);
				Static156.aByteArray78[2] = (byte) arg2;
				Static156.aByteArray78[5] = (byte) local28;
				Static156.aByteArray78[4] = (byte) (local28 >> 8);
				this.aClass205_4.method5309((long) (arg3 * 6));
				this.aClass205_4.method5317(0, 6, Static156.aByteArray78);
				@Pc(174) int local174 = 0;
				@Pc(176) int local176 = 0;
				while (arg2 > local174) {
					@Pc(180) int local180 = 0;
					@Pc(216) int local216;
					if (arg0) {
						this.aClass205_3.method5309((long) (local28 * 520));
						try {
							this.aClass205_3.method5320(0, Static156.aByteArray78, 8);
						} catch (@Pc(199) EOFException local199) {
							return true;
						}
						local216 = ((Static156.aByteArray78[0] & 0xFF) << 8) + (Static156.aByteArray78[1] & 0xFF);
						local180 = ((Static156.aByteArray78[4] & 0xFF) << 16) + (Static156.aByteArray78[5] << 8 & 0xFF00) + (Static156.aByteArray78[6] & 0xFF);
						@Pc(253) int local253 = ((Static156.aByteArray78[2] & 0xFF) << 8) + (Static156.aByteArray78[3] & 0xFF);
						@Pc(259) int local259 = Static156.aByteArray78[7] & 0xFF;
						if (arg3 != local216 || local253 != local176 || local259 != this.anInt6577) {
							return false;
						}
						if (local180 < 0 || (long) local180 > this.aClass205_3.method5316() / 520L) {
							return false;
						}
					}
					if (local180 == 0) {
						arg0 = false;
						local180 = (int) ((this.aClass205_3.method5316() + 519L) / 520L);
						if (local180 == 0) {
							local180++;
						}
						if (local28 == local180) {
							local180++;
						}
					}
					Static156.aByteArray78[1] = (byte) arg3;
					Static156.aByteArray78[0] = (byte) (arg3 >> 8);
					if (arg2 - local174 <= 512) {
						local180 = 0;
					}
					Static156.aByteArray78[2] = (byte) (local176 >> 8);
					Static156.aByteArray78[3] = (byte) local176;
					Static156.aByteArray78[4] = (byte) (local180 >> 16);
					Static156.aByteArray78[5] = (byte) (local180 >> 8);
					Static156.aByteArray78[7] = (byte) this.anInt6577;
					Static156.aByteArray78[6] = (byte) local180;
					this.aClass205_3.method5309((long) (local28 * 520));
					this.aClass205_3.method5317(0, 8, Static156.aByteArray78);
					local216 = arg2 - local174;
					if (local216 > 512) {
						local216 = 512;
					}
					this.aClass205_3.method5317(local174, local216, arg1);
					local28 = local180;
					local174 += local216;
					local176++;
				}
				return true;
			} catch (@Pc(443) IOException local443) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([BIII)Z")
	public boolean method5526(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class205 local6 = this.aClass205_3;
		synchronized (this.aClass205_3) {
			if (arg1 < 0 || arg1 > this.anInt6584) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method5525(true, arg0, arg1, arg2);
			if (!local39) {
				local39 = this.method5525(false, arg0, arg1, arg2);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)[B")
	public byte[] method5529(@OriginalArg(0) int arg0) {
		@Pc(8) Class205 local8 = this.aClass205_3;
		synchronized (this.aClass205_3) {
			try {
				if (this.aClass205_4.method5316() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass205_4.method5309((long) (arg0 * 6));
				this.aClass205_4.method5320(0, Static156.aByteArray78, 6);
				@Pc(69) int local69 = ((Static156.aByteArray78[0] & 0xFF) << 16) + ((Static156.aByteArray78[1] & 0xFF) << 8) + (Static156.aByteArray78[2] & 0xFF);
				@Pc(91) int local91 = ((Static156.aByteArray78[3] & 0xFF) << 16) + ((Static156.aByteArray78[4] & 0xFF) << 8) + (Static156.aByteArray78[5] & 0xFF);
				if (local69 < 0 || local69 > this.anInt6584) {
					return null;
				} else if (local91 > 0 && this.aClass205_3.method5316() / 520L >= (long) local91) {
					@Pc(132) byte[] local132 = new byte[local69];
					@Pc(143) int local143 = 0;
					@Pc(145) int local145 = 0;
					while (local69 > local143) {
						if (local91 == 0) {
							return null;
						}
						this.aClass205_3.method5309((long) (local91 * 520));
						@Pc(171) int local171 = local69 - local143;
						if (local171 > 512) {
							local171 = 512;
						}
						this.aClass205_3.method5320(0, Static156.aByteArray78, local171 + 8);
						@Pc(201) int local201 = ((Static156.aByteArray78[0] & 0xFF) << 8) + (Static156.aByteArray78[1] & 0xFF);
						@Pc(215) int local215 = (Static156.aByteArray78[3] & 0xFF) + ((Static156.aByteArray78[2] & 0xFF) << 8);
						@Pc(238) int local238 = (Static156.aByteArray78[6] & 0xFF) + ((Static156.aByteArray78[4] & 0xFF) << 16) + ((Static156.aByteArray78[5] & 0xFF) << 8);
						@Pc(244) int local244 = Static156.aByteArray78[7] & 0xFF;
						if (arg0 == local201 && local215 == local145 && this.anInt6577 == local244) {
							if (local238 >= 0 && this.aClass205_3.method5316() / 520L >= (long) local238) {
								for (@Pc(288) int local288 = 0; local288 < local171; local288++) {
									local132[local143++] = Static156.aByteArray78[local288 + 8];
								}
								local145++;
								local91 = local238;
								continue;
							}
							return null;
						}
						return null;
					}
					return local132;
				} else {
					return null;
				}
			} catch (@Pc(320) IOException local320) {
				return null;
			}
		}
	}
}
