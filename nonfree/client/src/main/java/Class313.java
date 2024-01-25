import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class313 {

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "Lclient!rt;")
	private Class302 aClass302_10 = null;

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
	private int anInt8286 = 65000;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "Lclient!rt;")
	private Class302 aClass302_11 = null;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
	private final int anInt8280;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILclient!rt;Lclient!rt;I)V")
	public Class313(@OriginalArg(0) int arg0, @OriginalArg(1) Class302 arg1, @OriginalArg(2) Class302 arg2, @OriginalArg(3) int arg3) {
		this.aClass302_10 = arg2;
		this.anInt8280 = arg0;
		this.anInt8286 = arg3;
		this.aClass302_11 = arg1;
	}

	@OriginalMember(owner = "client!sp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt8280;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B[BII)Z")
	public boolean method6693(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class302 local16 = this.aClass302_11;
		synchronized (this.aClass302_11) {
			if (arg2 < 0 || arg2 > this.anInt8286) {
				throw new IllegalArgumentException();
			}
			@Pc(43) boolean local43 = this.method6698(arg2, arg0, arg1, true);
			if (!local43) {
				local43 = this.method6698(arg2, arg0, arg1, false);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)[B")
	public byte[] method6694(@OriginalArg(0) int arg0) {
		@Pc(8) Class302 local8 = this.aClass302_11;
		synchronized (this.aClass302_11) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass302_10.method6451()) {
					return null;
				}
				this.aClass302_10.method6452((long) (arg0 * 6));
				this.aClass302_10.method6455(Static260.aByteArray40, 0, 6);
				@Pc(72) int local72 = ((Static260.aByteArray40[0] & 0xFF) << 16) + ((Static260.aByteArray40[1] & 0xFF) << 8) + (Static260.aByteArray40[2] & 0xFF);
				@Pc(95) int local95 = (Static260.aByteArray40[5] & 0xFF) + (((Static260.aByteArray40[3] & 0xFF) << 16) + ((Static260.aByteArray40[4] & 0xFF) << 8));
				if (local72 < 0 || this.anInt8286 < local72) {
					return null;
				} else if (local95 > 0 && (long) local95 <= this.aClass302_11.method6451() / 520L) {
					@Pc(139) byte[] local139 = new byte[local72];
					@Pc(141) int local141 = 0;
					@Pc(143) int local143 = 0;
					while (local72 > local141) {
						if (local95 == 0) {
							return null;
						}
						this.aClass302_11.method6452((long) (local95 * 520));
						@Pc(169) int local169 = local72 - local141;
						if (local169 > 512) {
							local169 = 512;
						}
						this.aClass302_11.method6455(Static260.aByteArray40, 0, local169 + 8);
						@Pc(199) int local199 = (Static260.aByteArray40[1] & 0xFF) + ((Static260.aByteArray40[0] & 0xFF) << 8);
						@Pc(213) int local213 = ((Static260.aByteArray40[2] & 0xFF) << 8) + (Static260.aByteArray40[3] & 0xFF);
						@Pc(236) int local236 = (Static260.aByteArray40[6] & 0xFF) + ((Static260.aByteArray40[4] & 0xFF) << 16) + ((Static260.aByteArray40[5] & 0xFF) << 8);
						@Pc(242) int local242 = Static260.aByteArray40[7] & 0xFF;
						if (local199 == arg0 && local143 == local213 && local242 == this.anInt8280) {
							if (local236 >= 0 && (long) local236 <= this.aClass302_11.method6451() / 520L) {
								for (@Pc(295) int local295 = 0; local295 < local169; local295++) {
									local139[local141++] = Static260.aByteArray40[local295 + 8];
								}
								local95 = local236;
								local143++;
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
			} catch (@Pc(331) IOException local331) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II[BIZ)Z")
	private boolean method6698(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class302 local8 = this.aClass302_11;
		synchronized (this.aClass302_11) {
			try {
				@Pc(69) int local69;
				if (arg3) {
					if ((long) (arg2 * 6 + 6) > this.aClass302_10.method6451()) {
						return false;
					}
					this.aClass302_10.method6452((long) (arg2 * 6));
					this.aClass302_10.method6455(Static260.aByteArray40, 0, 6);
					local69 = (Static260.aByteArray40[5] & 0xFF) + ((Static260.aByteArray40[4] & 0xFF) << 8) + ((Static260.aByteArray40[3] & 0xFF) << 16);
					if (local69 <= 0 || this.aClass302_11.method6451() / 520L < (long) local69) {
						return false;
					}
				} else {
					local69 = (int) ((this.aClass302_11.method6451() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static260.aByteArray40[2] = (byte) arg0;
				Static260.aByteArray40[5] = (byte) local69;
				Static260.aByteArray40[0] = (byte) (arg0 >> 16);
				Static260.aByteArray40[3] = (byte) (local69 >> 16);
				Static260.aByteArray40[1] = (byte) (arg0 >> 8);
				Static260.aByteArray40[4] = (byte) (local69 >> 8);
				this.aClass302_10.method6452((long) (arg2 * 6));
				this.aClass302_10.method6450(0, Static260.aByteArray40, 6);
				@Pc(166) int local166 = 0;
				@Pc(173) int local173 = 0;
				while (arg0 > local166) {
					@Pc(177) int local177 = 0;
					@Pc(213) int local213;
					if (arg3) {
						this.aClass302_11.method6452((long) (local69 * 520));
						try {
							this.aClass302_11.method6455(Static260.aByteArray40, 0, 8);
						} catch (@Pc(196) EOFException local196) {
							return true;
						}
						local213 = ((Static260.aByteArray40[0] & 0xFF) << 8) + (Static260.aByteArray40[1] & 0xFF);
						local177 = (Static260.aByteArray40[6] & 0xFF) + (((Static260.aByteArray40[4] & 0xFF) << 16) + ((Static260.aByteArray40[5] & 0xFF) << 8));
						@Pc(250) int local250 = (Static260.aByteArray40[3] & 0xFF) + ((Static260.aByteArray40[2] & 0xFF) << 8);
						@Pc(256) int local256 = Static260.aByteArray40[7] & 0xFF;
						if (local213 != arg2 || local173 != local250 || this.anInt8280 != local256) {
							return false;
						}
						if (local177 < 0 || (long) local177 > this.aClass302_11.method6451() / 520L) {
							return false;
						}
					}
					if (local177 == 0) {
						arg3 = false;
						local177 = (int) ((this.aClass302_11.method6451() + 519L) / 520L);
						if (local177 == 0) {
							local177++;
						}
						if (local177 == local69) {
							local177++;
						}
					}
					if (arg0 - local166 <= 512) {
						local177 = 0;
					}
					Static260.aByteArray40[3] = (byte) local173;
					Static260.aByteArray40[2] = (byte) (local173 >> 8);
					Static260.aByteArray40[0] = (byte) (arg2 >> 8);
					Static260.aByteArray40[1] = (byte) arg2;
					Static260.aByteArray40[6] = (byte) local177;
					Static260.aByteArray40[5] = (byte) (local177 >> 8);
					Static260.aByteArray40[4] = (byte) (local177 >> 16);
					Static260.aByteArray40[7] = (byte) this.anInt8280;
					this.aClass302_11.method6452((long) (local69 * 520));
					this.aClass302_11.method6450(0, Static260.aByteArray40, 8);
					local213 = arg0 - local166;
					if (local213 > 512) {
						local213 = 512;
					}
					this.aClass302_11.method6450(local166, arg1, local213);
					local166 += local213;
					local173++;
					local69 = local177;
				}
				return true;
			} catch (@Pc(432) IOException local432) {
				return false;
			}
		}
	}
}
