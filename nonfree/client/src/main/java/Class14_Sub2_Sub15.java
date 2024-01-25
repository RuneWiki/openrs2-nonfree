import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class14_Sub2_Sub15 extends Class14_Sub2 {

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "[Lclient!so;")
	public Class337[] aClass337Array1;

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
	private final int anInt9068;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
	public Class14_Sub2_Sub15(@OriginalArg(0) int arg0) {
		this.anInt9068 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)Z")
	public boolean method7829(@OriginalArg(1) int arg0) {
		return this.aClass337Array1[arg0].aBoolean653;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Z")
	public boolean method7830(@OriginalArg(1) int arg0) {
		return this.aClass337Array1[arg0].aBoolean651;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Z")
	public boolean method7831() {
		if (this.aClass337Array1 != null) {
			return true;
		}
		@Pc(36) int[] local36;
		@Pc(43) int local43;
		if (this.aByteArrayArray24 == null) {
			@Pc(16) Class310 local16 = Static499.aClass310_101;
			synchronized (Static499.aClass310_101) {
				if (!Static499.aClass310_101.method7776(this.anInt9068)) {
					return false;
				}
				local36 = Static499.aClass310_101.method7782(this.anInt9068);
				this.aByteArrayArray24 = new byte[local36.length][];
				for (local43 = 0; local43 < local36.length; local43++) {
					this.aByteArrayArray24[local43] = Static499.aClass310_101.method7803(local36[local43], this.anInt9068);
				}
			}
		}
		@Pc(74) boolean local74 = true;
		for (@Pc(76) int local76 = 0; local76 < this.aByteArrayArray24.length; local76++) {
			@Pc(83) byte[] local83 = this.aByteArrayArray24[local76];
			@Pc(88) Class14_Sub21 local88 = new Class14_Sub21(local83);
			local88.anInt8936 = 1;
			local43 = local88.method7717(-1978450544);
			@Pc(97) Class310 local97 = Static328.aClass310_64;
			synchronized (Static328.aClass310_64) {
				local74 &= Static328.aClass310_64.method7785(local43);
			}
		}
		if (!local74) {
			return false;
		}
		@Pc(141) Class32 local141 = new Class32();
		@Pc(143) Class310 local143 = Static499.aClass310_101;
		synchronized (Static499.aClass310_101) {
			@Pc(151) int local151 = Static499.aClass310_101.method7773(this.anInt9068);
			this.aClass337Array1 = new Class337[local151];
			local36 = Static499.aClass310_101.method7782(this.anInt9068);
		}
		for (local43 = 0; local43 < local36.length; local43++) {
			@Pc(178) byte[] local178 = this.aByteArrayArray24[local43];
			@Pc(183) Class14_Sub21 local183 = new Class14_Sub21(local178);
			local183.anInt8936 = 1;
			@Pc(192) int local192 = local183.method7717(-1978450544);
			@Pc(194) Class14_Sub22 local194 = null;
			for (@Pc(199) Class14_Sub22 local199 = (Class14_Sub22) local141.method584(); local199 != null; local199 = (Class14_Sub22) local141.method577()) {
				if (local192 == local199.anInt5145) {
					local194 = local199;
					break;
				}
			}
			if (local194 == null) {
				@Pc(225) Class310 local225 = Static328.aClass310_64;
				synchronized (Static328.aClass310_64) {
					local194 = new Class14_Sub22(local192, Static328.aClass310_64.method7795(local192));
				}
				local141.method582(local194);
			}
			this.aClass337Array1[local36[local43]] = new Class337(local178, local194);
		}
		this.aByteArrayArray24 = null;
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(II)Z")
	public boolean method7833(@OriginalArg(0) int arg0) {
		return this.aClass337Array1[arg0].aBoolean652;
	}
}
