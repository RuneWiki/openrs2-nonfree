import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class172 {

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!ps;")
	private Class257 aClass257_1 = null;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!ps;")
	private Class257 aClass257_2 = null;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	private int anInt4965 = 65000;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
	private final int anInt4960;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(ILclient!ps;Lclient!ps;I)V")
	public Class172(@OriginalArg(0) int arg0, @OriginalArg(1) Class257 arg1, @OriginalArg(2) Class257 arg2, @OriginalArg(3) int arg3) {
		this.aClass257_1 = arg2;
		this.aClass257_2 = arg1;
		this.anInt4960 = arg0;
		this.anInt4965 = arg3;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([BIZII)Z")
	private boolean method4298(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class257 local8 = this.aClass257_2;
		synchronized (this.aClass257_2) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass257_1.method5937() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass257_1.method5941((long) (arg3 * 6));
					this.aClass257_1.method5934(Static180.aByteArray16, 0, 6);
					local22 = (Static180.aByteArray16[5] & 0xFF) + ((Static180.aByteArray16[3] & 0xFF) << 16) + ((Static180.aByteArray16[4] & 0xFF) << 8);
					if (local22 <= 0 || (long) local22 > this.aClass257_2.method5937() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass257_2.method5937() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static180.aByteArray16[0] = (byte) (arg1 >> 16);
				Static180.aByteArray16[3] = (byte) (local22 >> 16);
				Static180.aByteArray16[1] = (byte) (arg1 >> 8);
				Static180.aByteArray16[5] = (byte) local22;
				Static180.aByteArray16[2] = (byte) arg1;
				Static180.aByteArray16[4] = (byte) (local22 >> 8);
				this.aClass257_1.method5941((long) (arg3 * 6));
				this.aClass257_1.method5939(Static180.aByteArray16, 6, 0);
				@Pc(165) int local165 = 0;
				@Pc(176) int local176 = 0;
				while (arg1 > local165) {
					@Pc(180) int local180 = 0;
					@Pc(215) int local215;
					if (arg2) {
						this.aClass257_2.method5941((long) (local22 * 520));
						try {
							this.aClass257_2.method5934(Static180.aByteArray16, 0, 8);
						} catch (@Pc(199) EOFException local199) {
							return true;
						}
						local215 = (Static180.aByteArray16[1] & 0xFF) + ((Static180.aByteArray16[0] & 0xFF) << 8);
						@Pc(229) int local229 = (Static180.aByteArray16[3] & 0xFF) + ((Static180.aByteArray16[2] & 0xFF) << 8);
						local180 = ((Static180.aByteArray16[5] & 0xFF) << 8) + ((Static180.aByteArray16[4] & 0xFF) << 16) + (Static180.aByteArray16[6] & 0xFF);
						@Pc(257) int local257 = Static180.aByteArray16[7] & 0xFF;
						if (arg3 != local215 || local229 != local176 || this.anInt4960 != local257) {
							return false;
						}
						if (local180 < 0 || this.aClass257_2.method5937() / 520L < (long) local180) {
							return false;
						}
					}
					if (local180 == 0) {
						local180 = (int) ((this.aClass257_2.method5937() + 519L) / 520L);
						arg2 = false;
						if (local180 == 0) {
							local180++;
						}
						if (local180 == local22) {
							local180++;
						}
					}
					if (arg1 - local165 <= 512) {
						local180 = 0;
					}
					Static180.aByteArray16[0] = (byte) (arg3 >> 8);
					Static180.aByteArray16[3] = (byte) local176;
					Static180.aByteArray16[1] = (byte) arg3;
					Static180.aByteArray16[2] = (byte) (local176 >> 8);
					Static180.aByteArray16[7] = (byte) this.anInt4960;
					Static180.aByteArray16[6] = (byte) local180;
					Static180.aByteArray16[5] = (byte) (local180 >> 8);
					Static180.aByteArray16[4] = (byte) (local180 >> 16);
					this.aClass257_2.method5941((long) (local22 * 520));
					this.aClass257_2.method5939(Static180.aByteArray16, 8, 0);
					local215 = arg1 - local165;
					if (local215 > 512) {
						local215 = 512;
					}
					this.aClass257_2.method5939(arg0, local215, local165);
					local176++;
					local22 = local180;
					local165 += local215;
				}
				return true;
			} catch (@Pc(441) IOException local441) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[BII)Z")
	public boolean method4300(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class257 local6 = this.aClass257_2;
		synchronized (this.aClass257_2) {
			if (arg0 < 0 || arg0 > this.anInt4965) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method4298(arg1, arg0, true, arg2);
			if (!local39) {
				local39 = this.method4298(arg1, arg0, false, arg2);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!kf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4960;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[B")
	public byte[] method4302(@OriginalArg(0) int arg0) {
		@Pc(8) Class257 local8 = this.aClass257_2;
		synchronized (this.aClass257_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass257_1.method5937()) {
					return null;
				}
				this.aClass257_1.method5941((long) (arg0 * 6));
				this.aClass257_1.method5934(Static180.aByteArray16, 0, 6);
				@Pc(67) int local67 = ((Static180.aByteArray16[1] & 0xFF) << 8) + (Static180.aByteArray16[0] << 16 & 0xFF0000) + (Static180.aByteArray16[2] & 0xFF);
				@Pc(95) int local95 = ((Static180.aByteArray16[4] & 0xFF) << 8) + (Static180.aByteArray16[3] << 16 & 0xFF0000) + (Static180.aByteArray16[5] & 0xFF);
				if (local67 < 0 || local67 > this.anInt4965) {
					return null;
				} else if (local95 > 0 && this.aClass257_2.method5937() / 520L >= (long) local95) {
					@Pc(132) byte[] local132 = new byte[local67];
					@Pc(134) int local134 = 0;
					@Pc(136) int local136 = 0;
					while (local134 < local67) {
						if (local95 == 0) {
							return null;
						}
						this.aClass257_2.method5941((long) (local95 * 520));
						@Pc(159) int local159 = local67 - local134;
						if (local159 > 512) {
							local159 = 512;
						}
						this.aClass257_2.method5934(Static180.aByteArray16, 0, local159 + 8);
						@Pc(189) int local189 = ((Static180.aByteArray16[0] & 0xFF) << 8) + (Static180.aByteArray16[1] & 0xFF);
						@Pc(204) int local204 = ((Static180.aByteArray16[2] & 0xFF) << 8) + (Static180.aByteArray16[3] & 0xFF);
						@Pc(228) int local228 = ((Static180.aByteArray16[4] & 0xFF) << 16) + ((Static180.aByteArray16[5] & 0xFF) << 8) + (Static180.aByteArray16[6] & 0xFF);
						@Pc(234) int local234 = Static180.aByteArray16[7] & 0xFF;
						if (arg0 == local189 && local136 == local204 && local234 == this.anInt4960) {
							if (local228 >= 0 && (long) local228 <= this.aClass257_2.method5937() / 520L) {
								for (@Pc(277) int local277 = 0; local277 < local159; local277++) {
									local132[local134++] = Static180.aByteArray16[local277 + 8];
								}
								local136++;
								local95 = local228;
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
			} catch (@Pc(305) IOException local305) {
				return null;
			}
		}
	}
}
