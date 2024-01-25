import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class Class65 implements Interface12 {

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
	public final int anInt4919;

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
	public final int anInt4923;

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
	public final int anInt4922;

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
	public final int anInt4917;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
	public final int anInt4916;

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "Lclient!dg;")
	public final Class72 aClass72_6;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "Lclient!fw;")
	public final Class114 aClass114_6;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!fw;Lclient!dg;IIIII)V")
	public Class65(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4919 = arg4;
		this.anInt4923 = arg3;
		this.anInt4922 = arg2;
		this.anInt4917 = arg6;
		this.anInt4916 = arg5;
		this.aClass72_6 = arg1;
		this.aClass114_6 = arg0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class136 method5811() {
		return null;
	}
}
