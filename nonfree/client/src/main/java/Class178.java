import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class Class178 implements Interface19 {

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
	public final int anInt4794;

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
	public final int anInt4798;

	@OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
	public final int anInt4797;

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "Lclient!ct;")
	public final Class62 aClass62_8;

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "Lclient!rc;")
	public final Class279 aClass279_7;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(ILclient!ct;Lclient!rc;II)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class279 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4794 = arg0;
		this.anInt4798 = arg3;
		this.anInt4797 = arg4;
		this.aClass62_8 = arg1;
		this.aClass279_7 = arg2;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return Static92.aClass357_1;
	}
}
