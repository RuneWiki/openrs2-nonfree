import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class199 {

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
	private int anInt5174 = 65000;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "Lclient!kaa;")
	private Class203 aClass203_4 = null;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "Lclient!kaa;")
	private Class203 aClass203_5 = null;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
	private final int anInt5169;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(ILclient!kaa;Lclient!kaa;I)V")
	public Class199(@OriginalArg(0) int arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) int arg3) {
		this.anInt5174 = arg3;
		this.aClass203_4 = arg1;
		this.aClass203_5 = arg2;
		this.anInt5169 = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)[B")
	public byte[] method4689(@OriginalArg(1) int arg0) {
		@Pc(8) Class203 local8 = this.aClass203_4;
		synchronized (this.aClass203_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass203_5.method4772()) {
					return null;
				}
				this.aClass203_5.method4768((long) (arg0 * 6));
				this.aClass203_5.method4765(0, Static460.aByteArray70, 6);
				@Pc(75) int local75 = (Static460.aByteArray70[2] & 0xFF) + (((Static460.aByteArray70[0] & 0xFF) << 16) + ((Static460.aByteArray70[1] & 0xFF) << 8));
				@Pc(98) int local98 = ((Static460.aByteArray70[4] & 0xFF) << 8) + ((Static460.aByteArray70[3] & 0xFF) << 16) + (Static460.aByteArray70[5] & 0xFF);
				if (local75 < 0 || this.anInt5174 < local75) {
					return null;
				} else if (local98 > 0 && this.aClass203_4.method4772() / 520L >= (long) local98) {
					@Pc(142) byte[] local142 = new byte[local75];
					@Pc(144) int local144 = 0;
					@Pc(146) int local146 = 0;
					while (local75 > local144) {
						if (local98 == 0) {
							return null;
						}
						this.aClass203_4.method4768((long) (local98 * 520));
						@Pc(174) int local174 = local75 - local144;
						if (local174 > 512) {
							local174 = 512;
						}
						this.aClass203_4.method4765(0, Static460.aByteArray70, local174 + 8);
						@Pc(205) int local205 = ((Static460.aByteArray70[0] & 0xFF) << 8) + (Static460.aByteArray70[1] & 0xFF);
						@Pc(220) int local220 = ((Static460.aByteArray70[2] & 0xFF) << 8) + (Static460.aByteArray70[3] & 0xFF);
						@Pc(242) int local242 = (Static460.aByteArray70[6] & 0xFF) + ((Static460.aByteArray70[4] & 0xFF) << 16) + ((Static460.aByteArray70[5] & 0xFF) << 8);
						@Pc(248) int local248 = Static460.aByteArray70[7] & 0xFF;
						if (arg0 == local205 && local146 == local220 && local248 == this.anInt5169) {
							if (local242 >= 0 && this.aClass203_4.method4772() / 520L >= (long) local242) {
								local146++;
								for (@Pc(302) int local302 = 0; local302 < local174; local302++) {
									local142[local144++] = Static460.aByteArray70[local302 + 8];
								}
								local98 = local242;
								continue;
							}
							return null;
						}
						return null;
					}
					return local142;
				} else {
					return null;
				}
			} catch (@Pc(345) IOException local345) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5169;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "([BIZII)Z")
	private boolean method4692(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class203 local8 = this.aClass203_4;
		synchronized (this.aClass203_4) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass203_5.method4772() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass203_5.method4768((long) (arg3 * 6));
					this.aClass203_5.method4765(0, Static460.aByteArray70, 6);
					local22 = ((Static460.aByteArray70[3] & 0xFF) << 16) + (((Static460.aByteArray70[4] & 0xFF) << 8) + (Static460.aByteArray70[5] & 0xFF));
					if (local22 <= 0 || this.aClass203_4.method4772() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass203_4.method4772() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static460.aByteArray70[2] = (byte) arg1;
				Static460.aByteArray70[0] = (byte) (arg1 >> 16);
				Static460.aByteArray70[4] = (byte) (local22 >> 8);
				Static460.aByteArray70[5] = (byte) local22;
				Static460.aByteArray70[1] = (byte) (arg1 >> 8);
				Static460.aByteArray70[3] = (byte) (local22 >> 16);
				this.aClass203_5.method4768((long) (arg3 * 6));
				this.aClass203_5.method4766(6, Static460.aByteArray70, 0);
				@Pc(177) int local177 = 0;
				@Pc(179) int local179 = 0;
				while (true) {
					if (arg1 > local177) {
						label102: {
							@Pc(185) int local185 = 0;
							@Pc(221) int local221;
							if (arg2) {
								this.aClass203_4.method4768((long) (local22 * 520));
								try {
									this.aClass203_4.method4765(0, Static460.aByteArray70, 8);
								} catch (@Pc(205) EOFException local205) {
									break label102;
								}
								local221 = (Static460.aByteArray70[1] & 0xFF) + ((Static460.aByteArray70[0] & 0xFF) << 8);
								local185 = (Static460.aByteArray70[6] & 0xFF) + (((Static460.aByteArray70[4] & 0xFF) << 16) + ((Static460.aByteArray70[5] & 0xFF) << 8));
								@Pc(258) int local258 = (Static460.aByteArray70[3] & 0xFF) + ((Static460.aByteArray70[2] & 0xFF) << 8);
								@Pc(264) int local264 = Static460.aByteArray70[7] & 0xFF;
								if (local221 != arg3 || local179 != local258 || local264 != this.anInt5169) {
									return false;
								}
								if (local185 < 0 || this.aClass203_4.method4772() / 520L < (long) local185) {
									return false;
								}
							}
							if (local185 == 0) {
								arg2 = false;
								local185 = (int) ((this.aClass203_4.method4772() + 519L) / 520L);
								if (local185 == 0) {
									local185++;
								}
								if (local22 == local185) {
									local185++;
								}
							}
							Static460.aByteArray70[1] = (byte) arg3;
							Static460.aByteArray70[3] = (byte) local179;
							Static460.aByteArray70[0] = (byte) (arg3 >> 8);
							if (arg1 - local177 <= 512) {
								local185 = 0;
							}
							Static460.aByteArray70[2] = (byte) (local179 >> 8);
							Static460.aByteArray70[7] = (byte) this.anInt5169;
							Static460.aByteArray70[4] = (byte) (local185 >> 16);
							Static460.aByteArray70[5] = (byte) (local185 >> 8);
							Static460.aByteArray70[6] = (byte) local185;
							this.aClass203_4.method4768((long) (local22 * 520));
							this.aClass203_4.method4766(8, Static460.aByteArray70, 0);
							local221 = arg1 - local177;
							if (local221 > 512) {
								local221 = 512;
							}
							this.aClass203_4.method4766(local221, arg0, local177);
							local179++;
							local22 = local185;
							local177 += local221;
							continue;
						}
					}
					@Pc(447) boolean local447 = true;
					return true;
				}
			} catch (@Pc(452) IOException local452) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II[BI)Z")
	public boolean method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(14) Class203 local14 = this.aClass203_4;
		synchronized (this.aClass203_4) {
			if (arg0 < 0 || arg0 > this.anInt5174) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method4692(arg2, arg0, true, arg1);
			if (!local39) {
				local39 = this.method4692(arg2, arg0, false, arg1);
			}
			return local39;
		}
	}
}
