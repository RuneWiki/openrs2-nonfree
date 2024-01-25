import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString2;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "Lclient!ak;")
	public final Class15 aClass15_1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) String arg0) {
		this.aString2 = arg0;
		this.aClass15_1 = new Class15();
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)I")
	public int method892() {
		return this.aClass15_1.aClass3_Sub4_5.aClass3_Sub4_66 == this.aClass15_1.aClass3_Sub4_5 ? -1 : ((Class3_Sub4_Sub13) this.aClass15_1.aClass3_Sub4_5.aClass3_Sub4_66).anInt4577;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ip;B)Z")
	public boolean method894(@OriginalArg(0) Class3_Sub4_Sub13 arg0) {
		@Pc(7) int local7 = this.method892();
		arg0.method8732();
		this.anInt805--;
		if (this.anInt805 != 0) {
			return this.method892() != local7;
		}
		this.method8769();
		this.method8732();
		Static157.anInt3113--;
		Static209.aClass102_25.method2674(arg0.aLong135, this);
		return false;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ip;I)Z")
	public boolean method895(@OriginalArg(0) Class3_Sub4_Sub13 arg0) {
		arg0.method8732();
		@Pc(15) boolean local15 = true;
		@Pc(21) Class3_Sub4_Sub13 local21 = (Class3_Sub4_Sub13) this.aClass15_1.method897();
		while (local21 != null) {
			if (Static181.method3130(arg0.anInt4577, local21.anInt4577)) {
				Static257.method4282(local21, arg0);
				this.anInt805++;
				if (local15) {
					return false;
				}
				return true;
			}
			local21 = (Class3_Sub4_Sub13) this.aClass15_1.method898();
			local15 = false;
		}
		this.aClass15_1.method901(arg0);
		this.anInt805++;
		return local15;
	}
}
