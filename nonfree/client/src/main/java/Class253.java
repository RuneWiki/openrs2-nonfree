import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class253 implements Interface24 {

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!da;")
	private Class19 aClass19_8;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Lclient!le;")
	private final Class205 aClass205_1;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!ae;")
	private final Class8 aClass8_105;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!ae;")
	private final Class8 aClass8_104;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!ae;Lclient!ae;Lclient!le;)V")
	public Class253(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class205 arg2) {
		this.aClass205_1 = arg2;
		this.aClass8_105 = arg1;
		this.aClass8_104 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	@Override
	public void method8705() {
		@Pc(15) Class151 local15 = Static581.method8055(this.aClass8_105, this.aClass205_1.anInt5725);
		this.aClass19_8 = Static546.aClass132_13.method7518(local15, Static681.method2329(this.aClass8_104, this.aClass205_1.anInt5725));
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8706() {
		@Pc(15) int local15 = this.aClass205_1.aClass7_7.method247(Static365.anInt6242, this.aClass205_1.anInt5729) + this.aClass205_1.anInt5732;
		@Pc(30) int local30 = this.aClass205_1.aClass249_10.method6236(Static335.anInt5755, this.aClass205_1.anInt5724) + this.aClass205_1.anInt5728;
		this.aClass19_8.method6326(local30, 0, this.aClass205_1.anInt5721, local15, this.aClass205_1.anInt5731, this.aClass205_1.anInt5729, this.aClass205_1.anInt5724, (Class9[]) null, this.aClass205_1.aString73, this.aClass205_1.anInt5723, (Class1) null, this.aClass205_1.anInt5726, this.aClass205_1.anInt5722, 0, (int[]) null);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8704() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass8_104.method273(this.aClass205_1.anInt5725)) {
			local5 = false;
		}
		if (!this.aClass8_105.method273(this.aClass205_1.anInt5725)) {
			local5 = false;
		}
		return local5;
	}
}
