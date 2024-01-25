import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class140 {

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!lr;")
	private Class129 aClass129_3 = null;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Lclient!lr;")
	private Class129 aClass129_4 = null;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
	private int anInt4179 = 65000;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	private final int anInt4172;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILclient!lr;Lclient!lr;I)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) int arg3) {
		this.anInt4172 = arg0;
		this.aClass129_4 = arg2;
		this.aClass129_3 = arg1;
		this.anInt4179 = arg3;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[BI)Z")
	public boolean method3883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class129 local6 = this.aClass129_3;
		synchronized (this.aClass129_3) {
			if (arg0 < 0 || this.anInt4179 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(34) boolean local34 = this.method3885(true, arg1, arg2, arg0);
			if (!local34) {
				local34 = this.method3885(false, arg1, arg2, arg0);
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[B")
	public byte[] method3884(@OriginalArg(1) int arg0) {
		@Pc(8) Class129 local8 = this.aClass129_3;
		synchronized (this.aClass129_3) {
			try {
				if (this.aClass129_4.method3357() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass129_4.method3365((long) (arg0 * 6));
				this.aClass129_4.method3364(Static31.aByteArray4, 6, 0);
				@Pc(67) int local67 = (Static31.aByteArray4[2] & 0xFF) + ((Static31.aByteArray4[1] & 0xFF) << 8) + ((Static31.aByteArray4[0] & 0xFF) << 16);
				@Pc(90) int local90 = ((Static31.aByteArray4[4] & 0xFF) << 8) + (((Static31.aByteArray4[3] & 0xFF) << 16) + (Static31.aByteArray4[5] & 0xFF));
				if (local67 < 0 || local67 > this.anInt4179) {
					return null;
				} else if (local90 > 0 && this.aClass129_3.method3357() / 520L >= (long) local90) {
					@Pc(128) byte[] local128 = new byte[local67];
					@Pc(130) int local130 = 0;
					@Pc(132) int local132 = 0;
					label55: while (local67 > local130) {
						if (local90 == 0) {
							return null;
						}
						this.aClass129_3.method3365((long) (local90 * 520));
						@Pc(154) int local154 = local67 - local130;
						if (local154 > 512) {
							local154 = 512;
						}
						this.aClass129_3.method3364(Static31.aByteArray4, local154 + 8, 0);
						@Pc(182) int local182 = (Static31.aByteArray4[1] & 0xFF) + ((Static31.aByteArray4[0] & 0xFF) << 8);
						@Pc(196) int local196 = (Static31.aByteArray4[3] & 0xFF) + ((Static31.aByteArray4[2] & 0xFF) << 8);
						@Pc(218) int local218 = (Static31.aByteArray4[6] & 0xFF) + ((Static31.aByteArray4[5] & 0xFF) << 8) + ((Static31.aByteArray4[4] & 0xFF) << 16);
						@Pc(224) int local224 = Static31.aByteArray4[7] & 0xFF;
						if (arg0 == local182 && local132 == local196 && this.anInt4172 == local224) {
							if (local218 >= 0 && this.aClass129_3.method3357() / 520L >= (long) local218) {
								local132++;
								local90 = local218;
								@Pc(274) int local274 = 0;
								while (true) {
									if (local154 <= local274) {
										continue label55;
									}
									local128[local130++] = Static31.aByteArray4[local274 + 8];
									local274++;
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
			} catch (@Pc(299) IOException local299) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4172;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZI[BI)Z")
	private boolean method3885(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class129 local8 = this.aClass129_3;
		synchronized (this.aClass129_3) {
			try {
				@Pc(81) int local81;
				if (arg0) {
					if (this.aClass129_4.method3357() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass129_4.method3365((long) (arg1 * 6));
					this.aClass129_4.method3364(Static31.aByteArray4, 6, 0);
					local81 = ((Static31.aByteArray4[3] & 0xFF) << 16) - (-((Static31.aByteArray4[4] & 0xFF) << 8) - (Static31.aByteArray4[5] & 0xFF));
					if (local81 <= 0 || this.aClass129_3.method3357() / 520L < (long) local81) {
						return false;
					}
				} else {
					local81 = (int) ((this.aClass129_3.method3357() + 519L) / 520L);
					if (local81 == 0) {
						local81 = 1;
					}
				}
				Static31.aByteArray4[2] = (byte) arg3;
				Static31.aByteArray4[0] = (byte) (arg3 >> 16);
				Static31.aByteArray4[3] = (byte) (local81 >> 16);
				Static31.aByteArray4[4] = (byte) (local81 >> 8);
				Static31.aByteArray4[1] = (byte) (arg3 >> 8);
				Static31.aByteArray4[5] = (byte) local81;
				this.aClass129_4.method3365((long) (arg1 * 6));
				this.aClass129_4.method3367(0, 6, Static31.aByteArray4);
				@Pc(168) int local168 = 0;
				@Pc(170) int local170 = 0;
				while (local168 < arg3) {
					@Pc(174) int local174 = 0;
					@Pc(209) int local209;
					if (arg0) {
						this.aClass129_3.method3365((long) (local81 * 520));
						try {
							this.aClass129_3.method3364(Static31.aByteArray4, 8, 0);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = ((Static31.aByteArray4[0] & 0xFF) << 8) + (Static31.aByteArray4[1] & 0xFF);
						local174 = ((Static31.aByteArray4[4] & 0xFF) << 16) - (-(Static31.aByteArray4[5] << 8 & 0xFF00) - (Static31.aByteArray4[6] & 0xFF));
						@Pc(246) int local246 = (Static31.aByteArray4[3] & 0xFF) + ((Static31.aByteArray4[2] & 0xFF) << 8);
						@Pc(252) int local252 = Static31.aByteArray4[7] & 0xFF;
						if (arg1 != local209 || local246 != local170 || this.anInt4172 != local252) {
							return false;
						}
						if (local174 < 0 || this.aClass129_3.method3357() / 520L < (long) local174) {
							return false;
						}
					}
					if (local174 == 0) {
						local174 = (int) ((this.aClass129_3.method3357() + 519L) / 520L);
						arg0 = false;
						if (local174 == 0) {
							local174++;
						}
						if (local174 == local81) {
							local174++;
						}
					}
					Static31.aByteArray4[2] = (byte) (local170 >> 8);
					Static31.aByteArray4[0] = (byte) (arg1 >> 8);
					Static31.aByteArray4[1] = (byte) arg1;
					Static31.aByteArray4[3] = (byte) local170;
					if (arg3 - local168 <= 512) {
						local174 = 0;
					}
					Static31.aByteArray4[6] = (byte) local174;
					Static31.aByteArray4[7] = (byte) this.anInt4172;
					Static31.aByteArray4[5] = (byte) (local174 >> 8);
					Static31.aByteArray4[4] = (byte) (local174 >> 16);
					this.aClass129_3.method3365((long) (local81 * 520));
					this.aClass129_3.method3367(0, 8, Static31.aByteArray4);
					local209 = arg3 - local168;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass129_3.method3367(local168, local209, arg2);
					local170++;
					local81 = local174;
					local168 += local209;
				}
				return true;
			} catch (@Pc(428) IOException local428) {
				return false;
			}
		}
	}
}
