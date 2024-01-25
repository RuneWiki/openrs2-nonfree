import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class293 implements Interface21 {

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "Lclient!da;")
	private Class73 aClass73_11;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Lclient!wm;")
	private final Class390 aClass390_95;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!wm;")
	private final Class390 aClass390_94;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "Lclient!jk;")
	private final Class181 aClass181_1;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!wm;Lclient!wm;Lclient!jk;)V")
	public Class293(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass390_95 = arg1;
		this.aClass390_94 = arg0;
		this.aClass181_1 = arg2;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	@Override
	public void method7888() {
		@Pc(17) Class247 local17 = Static331.method5104(this.aClass390_95, this.aClass181_1.anInt5627);
		this.aClass73_11 = Static208.aClass65_7.method6886(local17, Static689.method8546(this.aClass390_94, this.aClass181_1.anInt5627));
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7887() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass390_94.method8905(this.aClass181_1.anInt5627)) {
			local5 = false;
		}
		if (!this.aClass390_95.method8905(this.aClass181_1.anInt5627)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7886() {
		@Pc(16) int local16 = this.aClass181_1.aClass275_10.method6449(Static613.anInt10005, this.aClass181_1.anInt5620) + this.aClass181_1.anInt5630;
		@Pc(31) int local31 = this.aClass181_1.aClass81_13.method2034(Static10.anInt152, this.aClass181_1.anInt5616) + this.aClass181_1.anInt5622;
		this.aClass73_11.method5780(this.aClass181_1.anInt5617, (Class1) null, local16, local31, this.aClass181_1.aString46, 0, this.aClass181_1.anInt5615, (Class50[]) null, this.aClass181_1.anInt5620, 0, this.aClass181_1.anInt5624, this.aClass181_1.anInt5618, this.aClass181_1.anInt5626, this.aClass181_1.anInt5616, (int[]) null);
	}
}
