import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class32 {

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt1458 = 65000;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!ub;")
	private Class61 aClass61_1 = null;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "Lclient!ub;")
	private Class61 aClass61_2 = null;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
	private final int anInt1462;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ILclient!ub;Lclient!ub;I)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) int arg3) {
		this.aClass61_2 = arg1;
		this.aClass61_1 = arg2;
		this.anInt1462 = arg0;
		this.anInt1458 = arg3;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BI)Z")
	public boolean method980(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class61 local11 = this.aClass61_2;
		synchronized (this.aClass61_2) {
			if (arg0 < 0 || arg0 > this.anInt1458) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method983(arg1, arg2, true, arg0);
			if (!local35) {
				local35 = this.method983(arg1, arg2, false, arg0);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)[B")
	public byte[] method981(@OriginalArg(1) int arg0) {
		@Pc(8) Class61 local8 = this.aClass61_2;
		synchronized (this.aClass61_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass61_1.method1948()) {
					return null;
				}
				this.aClass61_1.method1949((long) (arg0 * 6));
				this.aClass61_1.method1953(6, Static63.aByteArray9, 0);
				@Pc(70) int local70 = ((Static63.aByteArray9[1] & 0xFF) << 8) + ((Static63.aByteArray9[0] & 0xFF) << 16) + (Static63.aByteArray9[2] & 0xFF);
				@Pc(93) int local93 = ((Static63.aByteArray9[3] & 0xFF) << 16) - (-((Static63.aByteArray9[4] & 0xFF) << 8) - (Static63.aByteArray9[5] & 0xFF));
				if (local70 < 0 || local70 > this.anInt1458) {
					return null;
				} else if (local93 > 0 && (long) local93 <= this.aClass61_2.method1948() / 520L) {
					@Pc(132) byte[] local132 = new byte[local70];
					@Pc(134) int local134 = 0;
					@Pc(146) int local146 = 0;
					label55: while (local70 > local146) {
						if (local93 == 0) {
							return null;
						}
						this.aClass61_2.method1949((long) (local93 * 520));
						@Pc(169) int local169 = local70 - local146;
						if (local169 > 512) {
							local169 = 512;
						}
						this.aClass61_2.method1953(local169 + 8, Static63.aByteArray9, 0);
						@Pc(199) int local199 = ((Static63.aByteArray9[0] & 0xFF) << 8) + (Static63.aByteArray9[1] & 0xFF);
						@Pc(205) int local205 = Static63.aByteArray9[7] & 0xFF;
						@Pc(227) int local227 = (Static63.aByteArray9[6] & 0xFF) + ((Static63.aByteArray9[4] & 0xFF) << 16) + ((Static63.aByteArray9[5] & 0xFF) << 8);
						@Pc(241) int local241 = (Static63.aByteArray9[3] & 0xFF) + ((Static63.aByteArray9[2] & 0xFF) << 8);
						if (local199 == arg0 && local241 == local134 && local205 == this.anInt1462) {
							if (local227 >= 0 && (long) local227 <= this.aClass61_2.method1948() / 520L) {
								local93 = local227;
								local134++;
								@Pc(288) int local288 = 0;
								while (true) {
									if (local169 <= local288) {
										continue label55;
									}
									local132[local146++] = Static63.aByteArray9[local288 + 8];
									local288++;
								}
							}
							return null;
						}
						return null;
					}
					return local132;
				} else {
					return null;
				}
			} catch (@Pc(321) IOException local321) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIZII)Z")
	private boolean method983(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class61 local8 = this.aClass61_2;
		synchronized (this.aClass61_2) {
			try {
				@Pc(67) int local67;
				if (arg2) {
					if (this.aClass61_1.method1948() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass61_1.method1949((long) (arg1 * 6));
					this.aClass61_1.method1953(6, Static63.aByteArray9, 0);
					local67 = (Static63.aByteArray9[5] & 0xFF) + ((Static63.aByteArray9[3] & 0xFF) << 16) + ((Static63.aByteArray9[4] & 0xFF) << 8);
					if (local67 <= 0 || this.aClass61_2.method1948() / 520L < (long) local67) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass61_2.method1948() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static63.aByteArray9[0] = (byte) (arg3 >> 16);
				Static63.aByteArray9[1] = (byte) (arg3 >> 8);
				Static63.aByteArray9[2] = (byte) arg3;
				Static63.aByteArray9[3] = (byte) (local67 >> 16);
				Static63.aByteArray9[4] = (byte) (local67 >> 8);
				@Pc(141) int local141 = 0;
				Static63.aByteArray9[5] = (byte) local67;
				this.aClass61_1.method1949((long) (arg1 * 6));
				@Pc(156) int local156 = 0;
				this.aClass61_1.method1952(0, 6, Static63.aByteArray9);
				while (local141 < arg3) {
					@Pc(167) int local167 = 0;
					@Pc(224) int local224;
					if (arg2) {
						this.aClass61_2.method1949((long) (local67 * 520));
						try {
							this.aClass61_2.method1953(8, Static63.aByteArray9, 0);
						} catch (@Pc(186) EOFException local186) {
							return true;
						}
						local167 = ((Static63.aByteArray9[5] & 0xFF) << 8) + ((Static63.aByteArray9[4] & 0xFF) << 16) + (Static63.aByteArray9[6] & 0xFF);
						local224 = ((Static63.aByteArray9[0] & 0xFF) << 8) + (Static63.aByteArray9[1] & 0xFF);
						@Pc(238) int local238 = (Static63.aByteArray9[3] & 0xFF) + ((Static63.aByteArray9[2] & 0xFF) << 8);
						@Pc(244) int local244 = Static63.aByteArray9[7] & 0xFF;
						if (local224 != arg1 || local238 != local156 || this.anInt1462 != local244) {
							return false;
						}
						if (local167 < 0 || this.aClass61_2.method1948() / 520L < (long) local167) {
							return false;
						}
					}
					if (local167 == 0) {
						arg2 = false;
						local167 = (int) ((this.aClass61_2.method1948() + 519L) / 520L);
						if (local167 == 0) {
							local167++;
						}
						if (local67 == local167) {
							local167++;
						}
					}
					Static63.aByteArray9[0] = (byte) (arg1 >> 8);
					Static63.aByteArray9[1] = (byte) arg1;
					if (arg3 - local141 <= 512) {
						local167 = 0;
					}
					Static63.aByteArray9[2] = (byte) (local156 >> 8);
					local224 = arg3 - local141;
					if (local224 > 512) {
						local224 = 512;
					}
					Static63.aByteArray9[3] = (byte) local156;
					Static63.aByteArray9[4] = (byte) (local167 >> 16);
					local156++;
					Static63.aByteArray9[5] = (byte) (local167 >> 8);
					Static63.aByteArray9[6] = (byte) local167;
					Static63.aByteArray9[7] = (byte) this.anInt1462;
					this.aClass61_2.method1949((long) (local67 * 520));
					local67 = local167;
					this.aClass61_2.method1952(0, 8, Static63.aByteArray9);
					this.aClass61_2.method1952(local141, local224, arg0);
					local141 += local224;
				}
				return true;
			} catch (@Pc(427) IOException local427) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1462;
	}
}
