import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class6_Sub4_Sub4 extends Class6_Sub4 {

	@OriginalMember(owner = "client!g", name = "w", descriptor = "[Lclient!am;")
	public Class20[] aClass20Array1;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "I")
	private final int anInt2848;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
	public Class6_Sub4_Sub4(@OriginalArg(0) int arg0) {
		this.anInt2848 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
	public boolean method2426() {
		if (this.aClass20Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray9 == null) {
			@Pc(15) Class8 local15 = Static622.aClass8_138;
			synchronized (Static622.aClass8_138) {
				if (!Static622.aClass8_138.method278(this.anInt2848)) {
					return false;
				}
				local35 = Static622.aClass8_138.method263(this.anInt2848);
				this.aByteArrayArray9 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray9[local42] = Static622.aClass8_138.method262(local35[local42], this.anInt2848);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray9.length; local71++) {
			@Pc(78) byte[] local78 = this.aByteArrayArray9[local71];
			@Pc(83) Class6_Sub23 local83 = new Class6_Sub23(local78);
			local83.anInt9901 = 1;
			local42 = local83.method8363();
			@Pc(92) Class8 local92 = Static596.aClass8_134;
			synchronized (Static596.aClass8_134) {
				local69 &= Static596.aClass8_134.method273(local42);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(121) Class362 local121 = new Class362();
		@Pc(123) Class8 local123 = Static622.aClass8_138;
		synchronized (Static622.aClass8_138) {
			@Pc(131) int local131 = Static622.aClass8_138.method280(this.anInt2848);
			this.aClass20Array1 = new Class20[local131];
			local35 = Static622.aClass8_138.method263(this.anInt2848);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(156) byte[] local156 = this.aByteArrayArray9[local42];
			@Pc(161) Class6_Sub23 local161 = new Class6_Sub23(local156);
			local161.anInt9901 = 1;
			@Pc(168) int local168 = local161.method8363();
			@Pc(170) Class6_Sub31 local170 = null;
			for (@Pc(175) Class6_Sub31 local175 = (Class6_Sub31) local121.method8538(); local175 != null; local175 = (Class6_Sub31) local121.method8530()) {
				if (local175.anInt4849 == local168) {
					local170 = local175;
					break;
				}
			}
			if (local170 == null) {
				@Pc(201) Class8 local201 = Static596.aClass8_134;
				synchronized (Static596.aClass8_134) {
					local170 = new Class6_Sub31(local168, Static596.aClass8_134.method267(local168));
				}
				local121.method8536(local170);
			}
			this.aClass20Array1[local35[local42]] = new Class20(local156, local170);
		}
		this.aByteArrayArray9 = null;
		return true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	public boolean method2427(@OriginalArg(0) int arg0) {
		return this.aClass20Array1[arg0].aBoolean26;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
	public boolean method2428(@OriginalArg(0) int arg0) {
		return this.aClass20Array1[arg0].aBoolean27;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(II)Z")
	public boolean method2430(@OriginalArg(1) int arg0) {
		return this.aClass20Array1[arg0].aBoolean28;
	}
}
