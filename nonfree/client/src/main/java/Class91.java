import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class Class91 implements Interface14 {

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
	public final int anInt2858;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!ia;")
	public final Class140 aClass140_2;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
	public final int anInt2863;

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "Lclient!sc;")
	public final Class300 aClass300_5;

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
	public final int anInt2857;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(ILclient!sc;Lclient!ia;II)V")
	public Class91(@OriginalArg(0) int arg0, @OriginalArg(1) Class300 arg1, @OriginalArg(2) Class140 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2858 = arg3;
		this.aClass140_2 = arg2;
		this.anInt2863 = arg0;
		this.aClass300_5 = arg1;
		this.anInt2857 = arg4;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Lclient!ph;")
	@Override
	public Class260 method6943() {
		return Static543.aClass260_12;
	}
}
