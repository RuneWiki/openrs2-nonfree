import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class Class2 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLclient!id;)Lclient!id;")
	public abstract Class1_Sub2_Sub6 method25(@OriginalArg(1) Class1_Sub2_Sub6 arg0);
}
