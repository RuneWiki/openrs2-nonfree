import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class5_Sub5_Sub12 extends Class5_Sub5 {

	@OriginalMember(owner = "client!vea", name = "p", descriptor = "[I")
	public static final int[] anIntArray573 = new int[128];

	@OriginalMember(owner = "client!vea", name = "q", descriptor = "Z")
	private boolean aBoolean732;

	@OriginalMember(owner = "client!vea", name = "t", descriptor = "B")
	private byte aByte144;

	@OriginalMember(owner = "client!vea", name = "u", descriptor = "B")
	private byte aByte145;

	@OriginalMember(owner = "client!vea", name = "v", descriptor = "B")
	private byte aByte146;

	@OriginalMember(owner = "client!vea", name = "z", descriptor = "B")
	private byte aByte147;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray573.length; local4++) {
			anIntArray573[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray573[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray573[local33] = local33 + 26 - 97;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray573[local50] = local50 + 52 - 48;
		}
		anIntArray573[42] = anIntArray573[43] = 62;
		anIntArray573[45] = anIntArray573[47] = 63;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.aByte85 = this.aByte145;
		arg0.aByte86 = this.aByte147;
		arg0.aBoolean463 = this.aBoolean732;
		arg0.aByte84 = this.aByte146;
		arg0.aByte83 = this.aByte144;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		this.aBoolean732 = arg0.method3642() == 1;
		this.aByte145 = arg0.method3677();
		this.aByte146 = arg0.method3677();
		this.aByte144 = arg0.method3677();
		this.aByte147 = arg0.method3677();
	}
}
