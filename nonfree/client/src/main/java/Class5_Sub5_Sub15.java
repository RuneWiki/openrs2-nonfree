import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class5_Sub5_Sub15 extends Class5_Sub5 {

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "[Lclient!qk;")
	public Class294[] aClass294Array1;

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
	private final int anInt5602;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V")
	public Class5_Sub5_Sub15(@OriginalArg(0) int arg0) {
		this.anInt5602 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)Z")
	public boolean method4799(@OriginalArg(1) int arg0) {
		return this.aClass294Array1[arg0].aBoolean611;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)Z")
	public boolean method4801(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 93) {
			Static316.method4802();
		}
		return this.aClass294Array1[arg0].aBoolean610;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)Z")
	public boolean method4804() {
		if (this.aClass294Array1 != null) {
			return true;
		}
		@Pc(36) int[] local36;
		@Pc(43) int local43;
		if (this.aByteArrayArray12 == null) {
			@Pc(16) Class208 local16 = Static361.aClass208_84;
			synchronized (Static361.aClass208_84) {
				if (!Static361.aClass208_84.method4975(this.anInt5602)) {
					return false;
				}
				local36 = Static361.aClass208_84.method4979(this.anInt5602);
				this.aByteArrayArray12 = new byte[local36.length][];
				for (local43 = 0; local43 < local36.length; local43++) {
					this.aByteArrayArray12[local43] = Static361.aClass208_84.method4991(this.anInt5602, local36[local43], 14);
				}
			}
		}
		@Pc(78) boolean local78 = true;
		@Pc(101) Class208 local101;
		for (@Pc(80) int local80 = 0; local80 < this.aByteArrayArray12.length; local80++) {
			@Pc(87) byte[] local87 = this.aByteArrayArray12[local80];
			@Pc(92) Class5_Sub23 local92 = new Class5_Sub23(local87);
			local92.anInt9869 = 1;
			local43 = local92.method8519();
			local101 = Static225.aClass208_55;
			synchronized (Static225.aClass208_55) {
				local78 &= Static225.aClass208_55.method4977(local43);
			}
		}
		if (!local78) {
			return false;
		}
		@Pc(133) Class102 local133 = new Class102();
		local101 = Static361.aClass208_84;
		@Pc(152) int local152;
		synchronized (Static361.aClass208_84) {
			local152 = Static361.aClass208_84.method5005(this.anInt5602);
			this.aClass294Array1 = new Class294[local152];
			local36 = Static361.aClass208_84.method4979(this.anInt5602);
		}
		for (local43 = 0; local43 < local36.length; local43++) {
			@Pc(179) byte[] local179 = this.aByteArrayArray12[local43];
			@Pc(184) Class5_Sub23 local184 = new Class5_Sub23(local179);
			local184.anInt9869 = 1;
			local152 = local184.method8519();
			@Pc(193) Class5_Sub39 local193 = null;
			for (@Pc(198) Class5_Sub39 local198 = (Class5_Sub39) local133.method1916(); local198 != null; local198 = (Class5_Sub39) local133.method1915()) {
				if (local198.anInt7688 == local152) {
					local193 = local198;
					break;
				}
			}
			if (local193 == null) {
				@Pc(224) Class208 local224 = Static225.aClass208_55;
				synchronized (Static225.aClass208_55) {
					local193 = new Class5_Sub39(local152, Static225.aClass208_55.method4997(local152));
				}
				local133.method1921(local193);
			}
			this.aClass294Array1[local36[local43]] = new Class294(local179, local193);
		}
		this.aByteArrayArray12 = null;
		return true;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Z")
	public boolean method4805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -25695) {
			this.method4801(-23, (byte) -104);
		}
		return this.aClass294Array1[arg0].aBoolean612;
	}
}
