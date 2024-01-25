import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!qba", name = "C", descriptor = "[Lclient!gq;")
	private static final Class128[] aClass128Array1 = new Class128[32];

	@OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
	public int anInt7305;

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
	public final int anInt7304;

	static {
		@Pc(89) Class128[] local89 = Static385.method5300();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass128Array1[local89[local91].anInt3034] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(II)V")
	public Class1_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7305 = arg1;
		this.anInt7304 = arg0;
	}
}
