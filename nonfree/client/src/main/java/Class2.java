import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public abstract class Class2 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "[Lclient!hca;")
	public static final Class134[] aClass134Array24 = new Class134[5];

	static {
		for (@Pc(7) int local7 = 0; local7 < aClass134Array24.length; local7++) {
			aClass134Array24[local7] = new Class134();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	public abstract Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0);

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(Lclient!oa;I)V")
	public abstract void method8384(@OriginalArg(0) Class15 arg0);

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	public abstract Class44 method8385(@OriginalArg(0) Class15 arg0);

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(B)V")
	public abstract void method8386();

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	public abstract void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Z")
	public abstract boolean method8388();

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILclient!oa;I)Z")
	public abstract boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2);
}
