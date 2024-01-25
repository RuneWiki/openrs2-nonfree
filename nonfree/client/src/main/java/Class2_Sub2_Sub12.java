import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
	public int anInt4924;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString52;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "Lclient!dm;")
	public final Class75 aClass75_9;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub2_Sub12(@OriginalArg(0) String arg0) {
		this.aString52 = arg0;
		this.aClass75_9 = new Class75();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!jm;I)Z")
	public boolean method4157(@OriginalArg(0) Class2_Sub2_Sub11 arg0) {
		@Pc(7) boolean local7 = true;
		arg0.method8271();
		@Pc(16) Class2_Sub2_Sub11 local16 = (Class2_Sub2_Sub11) this.aClass75_9.method1573();
		while (local16 != null) {
			if (Static214.method2961(local16.anInt4369, arg0.anInt4369)) {
				Static262.method4769(arg0, local16);
				this.anInt4924++;
				if (local7) {
					return false;
				}
				return true;
			}
			local16 = (Class2_Sub2_Sub11) this.aClass75_9.method1568();
			local7 = false;
		}
		this.aClass75_9.method1572(arg0);
		this.anInt4924++;
		return local7;
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(B)I")
	public int method4159() {
		return this.aClass75_9.aClass2_Sub2_26 == this.aClass75_9.aClass2_Sub2_26.aClass2_Sub2_67 ? -1 : ((Class2_Sub2_Sub11) this.aClass75_9.aClass2_Sub2_26.aClass2_Sub2_67).anInt4369;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLclient!jm;)Z")
	public boolean method4160(@OriginalArg(1) Class2_Sub2_Sub11 arg0) {
		@Pc(7) int local7 = this.method4159();
		arg0.method8271();
		this.anInt4924--;
		if (this.anInt4924 != 0) {
			return this.method4159() != local7;
		}
		this.method8653();
		this.method8271();
		Static121.anInt2166--;
		Static446.aClass32_79.method629(this, arg0.aLong123);
		return false;
	}
}
