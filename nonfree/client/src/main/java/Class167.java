import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class167 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	private int anInt4946 = 65000;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Lclient!vv;")
	private Class307 aClass307_3 = null;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "Lclient!vv;")
	private Class307 aClass307_4 = null;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "I")
	private final int anInt4953;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(ILclient!vv;Lclient!vv;I)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) Class307 arg1, @OriginalArg(2) Class307 arg2, @OriginalArg(3) int arg3) {
		this.aClass307_3 = arg2;
		this.anInt4946 = arg3;
		this.aClass307_4 = arg1;
		this.anInt4953 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4953;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[BII)Z")
	public boolean method4291(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class307 local11 = this.aClass307_4;
		synchronized (this.aClass307_4) {
			if (arg2 < 0 || arg2 > this.anInt4946) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method4292(true, arg0, arg2, arg1);
			if (!local38) {
				local38 = this.method4292(false, arg0, arg2, arg1);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z[BIII)Z")
	private boolean method4292(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class307 local8 = this.aClass307_4;
		synchronized (this.aClass307_4) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if (this.aClass307_3.method7183() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass307_3.method7175((long) (arg3 * 6));
					this.aClass307_3.method7182(0, Static398.aByteArray102, 6);
					local22 = ((Static398.aByteArray102[3] & 0xFF) << 16) + ((Static398.aByteArray102[4] & 0xFF) << 8) + (Static398.aByteArray102[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass307_4.method7183() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass307_4.method7183() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static398.aByteArray102[5] = (byte) local22;
				Static398.aByteArray102[1] = (byte) (arg2 >> 8);
				Static398.aByteArray102[3] = (byte) (local22 >> 16);
				Static398.aByteArray102[4] = (byte) (local22 >> 8);
				Static398.aByteArray102[0] = (byte) (arg2 >> 16);
				Static398.aByteArray102[2] = (byte) arg2;
				this.aClass307_3.method7175((long) (arg3 * 6));
				this.aClass307_3.method7184(Static398.aByteArray102, 0, 6);
				@Pc(168) int local168 = 0;
				@Pc(170) int local170 = 0;
				while (local168 < arg2) {
					@Pc(174) int local174 = 0;
					@Pc(209) int local209;
					if (arg0) {
						this.aClass307_4.method7175((long) (local22 * 520));
						try {
							this.aClass307_4.method7182(0, Static398.aByteArray102, 8);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = (Static398.aByteArray102[1] & 0xFF) + ((Static398.aByteArray102[0] & 0xFF) << 8);
						@Pc(223) int local223 = (Static398.aByteArray102[3] & 0xFF) + ((Static398.aByteArray102[2] & 0xFF) << 8);
						local174 = ((Static398.aByteArray102[5] & 0xFF) << 8) + ((Static398.aByteArray102[4] & 0xFF) << 16) + (Static398.aByteArray102[6] & 0xFF);
						@Pc(251) int local251 = Static398.aByteArray102[7] & 0xFF;
						if (local209 != arg3 || local223 != local170 || local251 != this.anInt4953) {
							return false;
						}
						if (local174 < 0 || (long) local174 > this.aClass307_4.method7183() / 520L) {
							return false;
						}
					}
					if (local174 == 0) {
						arg0 = false;
						local174 = (int) ((this.aClass307_4.method7183() + 519L) / 520L);
						if (local174 == 0) {
							local174++;
						}
						if (local174 == local22) {
							local174++;
						}
					}
					if (arg2 - local168 <= 512) {
						local174 = 0;
					}
					Static398.aByteArray102[1] = (byte) arg3;
					Static398.aByteArray102[0] = (byte) (arg3 >> 8);
					Static398.aByteArray102[3] = (byte) local170;
					Static398.aByteArray102[2] = (byte) (local170 >> 8);
					Static398.aByteArray102[6] = (byte) local174;
					Static398.aByteArray102[4] = (byte) (local174 >> 16);
					Static398.aByteArray102[5] = (byte) (local174 >> 8);
					Static398.aByteArray102[7] = (byte) this.anInt4953;
					this.aClass307_4.method7175((long) (local22 * 520));
					this.aClass307_4.method7184(Static398.aByteArray102, 0, 8);
					local209 = arg2 - local168;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass307_4.method7184(arg1, local168, local209);
					local22 = local174;
					local170++;
					local168 += local209;
				}
				return true;
			} catch (@Pc(439) IOException local439) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[B")
	public byte[] method4293(@OriginalArg(1) int arg0) {
		@Pc(8) Class307 local8 = this.aClass307_4;
		synchronized (this.aClass307_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass307_3.method7183()) {
					return null;
				}
				this.aClass307_3.method7175((long) (arg0 * 6));
				this.aClass307_3.method7182(0, Static398.aByteArray102, 6);
				@Pc(67) int local67 = ((Static398.aByteArray102[0] & 0xFF) << 16) + ((Static398.aByteArray102[1] & 0xFF) << 8) + (Static398.aByteArray102[2] & 0xFF);
				@Pc(90) int local90 = ((Static398.aByteArray102[4] & 0xFF) << 8) + (((Static398.aByteArray102[3] & 0xFF) << 16) + (Static398.aByteArray102[5] & 0xFF));
				if (local67 < 0 || local67 > this.anInt4946) {
					return null;
				} else if (local90 > 0 && (long) local90 <= this.aClass307_4.method7183() / 520L) {
					@Pc(126) byte[] local126 = new byte[local67];
					@Pc(128) int local128 = 0;
					@Pc(139) int local139 = 0;
					while (local67 > local128) {
						if (local90 == 0) {
							return null;
						}
						this.aClass307_4.method7175((long) (local90 * 520));
						@Pc(165) int local165 = local67 - local128;
						if (local165 > 512) {
							local165 = 512;
						}
						this.aClass307_4.method7182(0, Static398.aByteArray102, local165 + 8);
						@Pc(193) int local193 = (Static398.aByteArray102[1] & 0xFF) + ((Static398.aByteArray102[0] & 0xFF) << 8);
						@Pc(207) int local207 = (Static398.aByteArray102[3] & 0xFF) + ((Static398.aByteArray102[2] & 0xFF) << 8);
						@Pc(229) int local229 = (Static398.aByteArray102[6] & 0xFF) + ((Static398.aByteArray102[5] & 0xFF) << 8) + ((Static398.aByteArray102[4] & 0xFF) << 16);
						@Pc(235) int local235 = Static398.aByteArray102[7] & 0xFF;
						if (arg0 == local193 && local139 == local207 && local235 == this.anInt4953) {
							if (local229 >= 0 && (long) local229 <= this.aClass307_4.method7183() / 520L) {
								for (@Pc(279) int local279 = 0; local279 < local165; local279++) {
									local126[local128++] = Static398.aByteArray102[local279 + 8];
								}
								local139++;
								local90 = local229;
								continue;
							}
							return null;
						}
						return null;
					}
					return local126;
				} else {
					return null;
				}
			} catch (@Pc(307) IOException local307) {
				return null;
			}
		}
	}
}
