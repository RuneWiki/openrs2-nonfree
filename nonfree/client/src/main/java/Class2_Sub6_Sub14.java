import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class2_Sub6_Sub14 extends Class2_Sub6 {

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "[Lclient!cm;")
	public Class66[] aClass66Array1;

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	private final int anInt7624;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	public Class2_Sub6_Sub14(@OriginalArg(0) int arg0) {
		this.anInt7624 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Z")
	public boolean method6814() {
		if (this.aClass66Array1 != null) {
			return true;
		}
		@Pc(38) int[] local38;
		@Pc(45) int local45;
		if (this.aByteArrayArray14 == null) {
			@Pc(16) Class254 local16 = Static441.aClass254_119;
			synchronized (Static441.aClass254_119) {
				if (!Static441.aClass254_119.method6095(this.anInt7624)) {
					return false;
				}
				local38 = Static441.aClass254_119.method6088(this.anInt7624);
				this.aByteArrayArray14 = new byte[local38.length][];
				for (local45 = 0; local45 < local38.length; local45++) {
					this.aByteArrayArray14[local45] = Static441.aClass254_119.method6087(local38[local45], this.anInt7624);
				}
			}
		}
		@Pc(76) boolean local76 = true;
		for (@Pc(78) int local78 = 0; local78 < this.aByteArrayArray14.length; local78++) {
			@Pc(85) byte[] local85 = this.aByteArrayArray14[local78];
			@Pc(90) Class2_Sub20 local90 = new Class2_Sub20(local85);
			local90.anInt9723 = 1;
			local45 = local90.method8575();
			@Pc(99) Class254 local99 = Static716.aClass254_170;
			synchronized (Static716.aClass254_170) {
				local76 &= Static716.aClass254_170.method6072(local45);
			}
		}
		if (!local76) {
			return false;
		}
		@Pc(137) Class60 local137 = new Class60();
		@Pc(139) Class254 local139 = Static441.aClass254_119;
		synchronized (Static441.aClass254_119) {
			@Pc(147) int local147 = Static441.aClass254_119.method6101(this.anInt7624);
			this.aClass66Array1 = new Class66[local147];
			local38 = Static441.aClass254_119.method6088(this.anInt7624);
		}
		for (local45 = 0; local45 < local38.length; local45++) {
			@Pc(182) byte[] local182 = this.aByteArrayArray14[local45];
			@Pc(187) Class2_Sub20 local187 = new Class2_Sub20(local182);
			local187.anInt9723 = 1;
			@Pc(194) int local194 = local187.method8575();
			@Pc(196) Class2_Sub39 local196 = null;
			for (@Pc(201) Class2_Sub39 local201 = (Class2_Sub39) local137.method1226(7); local201 != null; local201 = (Class2_Sub39) local137.method1228()) {
				if (local194 == local201.anInt6483) {
					local196 = local201;
					break;
				}
			}
			if (local196 == null) {
				@Pc(227) Class254 local227 = Static716.aClass254_170;
				synchronized (Static716.aClass254_170) {
					local196 = new Class2_Sub39(local194, Static716.aClass254_170.method6079(local194));
				}
				local137.method1233(local196);
			}
			this.aClass66Array1[local38[local45]] = new Class66(local182, local196);
		}
		this.aByteArrayArray14 = null;
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Z")
	public boolean method6815(@OriginalArg(0) int arg0) {
		return this.aClass66Array1[arg0].aBoolean192;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Z")
	public boolean method6816(@OriginalArg(1) int arg0) {
		return this.aClass66Array1[arg0].aBoolean194;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)Z")
	public boolean method6821(@OriginalArg(1) int arg0) {
		return this.aClass66Array1[arg0].aBoolean193;
	}
}
