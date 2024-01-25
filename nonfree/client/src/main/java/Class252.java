import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public abstract class Class252 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
	public static final int[] anIntArray602 = new int[128];

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray602.length; local4++) {
			anIntArray602[local4] = -1;
		}
		for (@Pc(16) int local16 = 65; local16 <= 90; local16++) {
			anIntArray602[local16] = local16 - 65;
		}
		for (@Pc(29) int local29 = 97; local29 <= 122; local29++) {
			anIntArray602[local29] = local29 + 26 - 97;
		}
		for (@Pc(44) int local44 = 48; local44 <= 57; local44++) {
			anIntArray602[local44] = local44 + 52 - 48;
		}
		anIntArray602[42] = anIntArray602[43] = 62;
		anIntArray602[45] = anIntArray602[47] = 63;
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	protected Class252() {
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Lclient!mr;")
	public abstract Interface16 method8817();

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Z")
	public abstract boolean method8818(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
	public abstract void method8820();

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
	public abstract void method8821();
}
