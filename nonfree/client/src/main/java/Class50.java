import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class50 {

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "Lclient!oaa;")
	public Class5_Sub16_Sub3 aClass5_Sub16_Sub3_1;

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "Lclient!ps;")
	public Class5_Sub24_Sub1 aClass5_Sub24_Sub1_1;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "Lclient!nv;")
	public Class5_Sub37 aClass5_Sub37_1;

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Lclient!ku;")
	public Class206 aClass206_1;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	public final int anInt848;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
	public final int anInt846;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
	public final int anInt851;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "B")
	public final byte aByte16;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
	public final int anInt853;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "Lclient!df;")
	public final Class8_Sub1 aClass8_Sub1_7;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
	public final int anInt854;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(BIIIIIILclient!df;)V")
	public Class50(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class8_Sub1 arg7) {
		this.anInt848 = arg1;
		this.anInt846 = arg4;
		this.anInt847 = arg3;
		this.anInt851 = arg6;
		this.aByte16 = arg0;
		this.anInt853 = arg2;
		this.aClass8_Sub1_7 = arg7;
		this.anInt854 = arg5;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)Z")
	public boolean method807() {
		return this.aByte16 == 2 || this.aByte16 == 3;
	}
}
