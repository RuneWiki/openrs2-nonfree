import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class14_Sub3_Sub21 extends Class14_Sub3 {

	@OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
	public int anInt11129;

	@OriginalMember(owner = "client!wn", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString119;

	@OriginalMember(owner = "client!wn", name = "I", descriptor = "Lclient!dha;")
	public final Class73 aClass73_13;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class14_Sub3_Sub21(@OriginalArg(0) String arg0) {
		this.aString119 = arg0;
		this.aClass73_13 = new Class73();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
	public int method9257() {
		return this.aClass73_13.aClass14_Sub3_20 == this.aClass73_13.aClass14_Sub3_20.aClass14_Sub3_67 ? -1 : ((Class14_Sub3_Sub11) this.aClass73_13.aClass14_Sub3_20.aClass14_Sub3_67).anInt4752;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!jga;I)Z")
	public boolean method9258(@OriginalArg(0) Class14_Sub3_Sub11 arg0) {
		arg0.method9253();
		@Pc(10) boolean local10 = true;
		@Pc(16) Class14_Sub3_Sub11 local16 = (Class14_Sub3_Sub11) this.aClass73_13.method1826();
		while (local16 != null) {
			if (Static379.method9309(arg0.anInt4752, local16.anInt4752)) {
				Static285.method4072(local16, arg0);
				this.anInt11129++;
				if (local10) {
					return false;
				}
				return true;
			}
			local16 = (Class14_Sub3_Sub11) this.aClass73_13.method1827();
			local10 = false;
		}
		this.aClass73_13.method1816(arg0);
		this.anInt11129++;
		return local10;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!jga;B)Z")
	public boolean method9262(@OriginalArg(0) Class14_Sub3_Sub11 arg0) {
		@Pc(7) int local7 = this.method9257();
		arg0.method9253();
		this.anInt11129--;
		if (this.anInt11129 != 0) {
			return local7 != this.method9257();
		}
		this.method9315();
		this.method9253();
		Static569.anInt9810--;
		Static228.aClass264_25.method6364(arg0.aLong145, this);
		return false;
	}
}
