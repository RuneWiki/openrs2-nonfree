import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class183 implements Interface2 {

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Lclient!da;")
	private Class57 aClass57_6;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "Lclient!ik;")
	private final Class182 aClass182_74;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Lclient!sa;")
	private final Class333 aClass333_1;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "Lclient!ik;")
	private final Class182 aClass182_73;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!ik;Lclient!ik;Lclient!sa;)V")
	public Class183(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class333 arg2) {
		this.aClass182_74 = arg0;
		this.aClass333_1 = arg2;
		this.aClass182_73 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9318() {
		@Pc(14) boolean local14 = true;
		if (!this.aClass182_74.method3964(this.aClass333_1.anInt8854)) {
			local14 = false;
		}
		if (!this.aClass182_73.method3964(this.aClass333_1.anInt8854)) {
			local14 = false;
		}
		return local14;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	@Override
	public void method9316() {
		@Pc(19) Class169 local19 = Static462.method6278(this.aClass333_1.anInt8854, this.aClass182_73);
		this.aClass57_6 = Static153.aClass22_4.method9353(local19, Static735.method8275(this.aClass182_74, this.aClass333_1.anInt8854), true);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9317() {
		@Pc(15) int local15 = this.aClass333_1.aClass223_13.method5074(this.aClass333_1.anInt8846, Static221.anInt3616) + this.aClass333_1.anInt8847;
		@Pc(29) int local29 = this.aClass333_1.aClass352_12.method7803(Static700.anInt10927, this.aClass333_1.anInt8850) + this.aClass333_1.anInt8859;
		this.aClass57_6.method9135(0, local29, (int[]) null, 0, this.aClass333_1.anInt8857, (Class178[]) null, this.aClass333_1.anInt8852, local15, this.aClass333_1.anInt8850, this.aClass333_1.anInt8858, this.aClass333_1.aString116, this.aClass333_1.anInt8853, (Class1) null, this.aClass333_1.anInt8856, this.aClass333_1.anInt8846);
	}
}
