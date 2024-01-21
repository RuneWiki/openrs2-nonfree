import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class40 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!ba;")
	private Class8 aClass8_3 = null;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
	private int anInt1430 = 65000;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!ba;")
	private Class8 aClass8_4 = null;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
	private final int anInt1429;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ILclient!ba;Lclient!ba;I)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3) {
		this.anInt1429 = arg0;
		this.anInt1430 = arg3;
		this.aClass8_3 = arg2;
		this.aClass8_4 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[B")
	public byte[] method1009(@OriginalArg(0) int arg0) {
		@Pc(8) Class8 local8 = this.aClass8_4;
		synchronized (this.aClass8_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass8_3.method171()) {
					return null;
				}
				this.aClass8_3.method166((long) (arg0 * 6));
				this.aClass8_3.method172(6, Static115.aByteArray39, 0);
				@Pc(68) int local68 = (Static115.aByteArray39[5] & 0xFF) + (((Static115.aByteArray39[3] & 0xFF) << 16) + ((Static115.aByteArray39[4] & 0xFF) << 8));
				@Pc(90) int local90 = (Static115.aByteArray39[2] & 0xFF) + ((Static115.aByteArray39[1] & 0xFF) << 8) + ((Static115.aByteArray39[0] & 0xFF) << 16);
				if (local90 < 0 || local90 > this.anInt1430) {
					return null;
				} else if (local68 > 0 && (long) local68 <= this.aClass8_4.method171() / 520L) {
					@Pc(139) byte[] local139 = new byte[local90];
					@Pc(141) int local141 = 0;
					@Pc(143) int local143 = 0;
					while (local90 > local141) {
						if (local68 == 0) {
							return null;
						}
						this.aClass8_4.method166((long) (local68 * 520));
						@Pc(171) int local171 = local90 - local141;
						if (local171 > 512) {
							local171 = 512;
						}
						this.aClass8_4.method172(local171 + 8, Static115.aByteArray39, 0);
						@Pc(193) int local193 = Static115.aByteArray39[7] & 0xFF;
						@Pc(207) int local207 = (Static115.aByteArray39[1] & 0xFF) + ((Static115.aByteArray39[0] & 0xFF) << 8);
						@Pc(229) int local229 = (Static115.aByteArray39[6] & 0xFF) + ((Static115.aByteArray39[4] & 0xFF) << 16) + ((Static115.aByteArray39[5] & 0xFF) << 8);
						@Pc(244) int local244 = ((Static115.aByteArray39[2] & 0xFF) << 8) + (Static115.aByteArray39[3] & 0xFF);
						if (local207 == arg0 && local244 == local143 && local193 == this.anInt1429) {
							if (local229 >= 0 && this.aClass8_4.method171() / 520L >= (long) local229) {
								local143++;
								for (@Pc(296) int local296 = 0; local296 < local171; local296++) {
									local139[local141++] = Static115.aByteArray39[local296 + 8];
								}
								local68 = local229;
								continue;
							}
							return null;
						}
						return null;
					}
					return local139;
				} else {
					return null;
				}
			} catch (@Pc(327) IOException local327) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1429;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI[BZI)Z")
	private boolean method1012(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class8 local8 = this.aClass8_4;
		synchronized (this.aClass8_4) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass8_3.method171() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass8_3.method166((long) (arg0 * 6));
					this.aClass8_3.method172(6, Static115.aByteArray39, 0);
					local22 = (Static115.aByteArray39[5] & 0xFF) + ((Static115.aByteArray39[3] & 0xFF) << 16) + ((Static115.aByteArray39[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass8_4.method171() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass8_4.method171() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static115.aByteArray39[3] = (byte) (local22 >> 16);
				@Pc(123) int local123 = 0;
				Static115.aByteArray39[2] = (byte) arg3;
				Static115.aByteArray39[0] = (byte) (arg3 >> 16);
				Static115.aByteArray39[4] = (byte) (local22 >> 8);
				Static115.aByteArray39[1] = (byte) (arg3 >> 8);
				@Pc(151) int local151 = 0;
				Static115.aByteArray39[5] = (byte) local22;
				this.aClass8_3.method166((long) (arg0 * 6));
				this.aClass8_3.method164(Static115.aByteArray39, 6, 0);
				while (local123 < arg3) {
					@Pc(175) int local175 = 0;
					@Pc(248) int local248;
					if (arg2) {
						this.aClass8_4.method166((long) (local22 * 520));
						try {
							this.aClass8_4.method172(8, Static115.aByteArray39, 0);
						} catch (@Pc(194) EOFException local194) {
							return true;
						}
						local175 = ((Static115.aByteArray39[5] & 0xFF) << 8) + ((Static115.aByteArray39[4] & 0xFF) << 16) + (Static115.aByteArray39[6] & 0xFF);
						@Pc(233) int local233 = ((Static115.aByteArray39[2] & 0xFF) << 8) + (Static115.aByteArray39[3] & 0xFF);
						local248 = ((Static115.aByteArray39[0] & 0xFF) << 8) + (Static115.aByteArray39[1] & 0xFF);
						@Pc(254) int local254 = Static115.aByteArray39[7] & 0xFF;
						if (arg0 != local248 || local233 != local151 || local254 != this.anInt1429) {
							return false;
						}
						if (local175 < 0 || this.aClass8_4.method171() / 520L < (long) local175) {
							return false;
						}
					}
					if (local175 == 0) {
						arg2 = false;
						local175 = (int) ((this.aClass8_4.method171() + 519L) / 520L);
						if (local175 == 0) {
							local175++;
						}
						if (local175 == local22) {
							local175++;
						}
					}
					Static115.aByteArray39[7] = (byte) this.anInt1429;
					Static115.aByteArray39[2] = (byte) (local151 >> 8);
					Static115.aByteArray39[0] = (byte) (arg0 >> 8);
					if (arg3 - local123 <= 512) {
						local175 = 0;
					}
					Static115.aByteArray39[1] = (byte) arg0;
					Static115.aByteArray39[3] = (byte) local151;
					Static115.aByteArray39[5] = (byte) (local175 >> 8);
					Static115.aByteArray39[6] = (byte) local175;
					local248 = arg3 - local123;
					local151++;
					Static115.aByteArray39[4] = (byte) (local175 >> 16);
					this.aClass8_4.method166((long) (local22 * 520));
					local22 = local175;
					this.aClass8_4.method164(Static115.aByteArray39, 8, 0);
					if (local248 > 512) {
						local248 = 512;
					}
					this.aClass8_4.method164(arg1, local248, local123);
					local123 += local248;
				}
				return true;
			} catch (@Pc(435) IOException local435) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III[B)Z")
	public boolean method1015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class8 local6 = this.aClass8_4;
		synchronized (this.aClass8_4) {
			if (arg0 < 0 || this.anInt1430 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(31) boolean local31 = this.method1012(arg1, arg2, true, arg0);
			if (!local31) {
				local31 = this.method1012(arg1, arg2, false, arg0);
			}
			return local31;
		}
	}
}
