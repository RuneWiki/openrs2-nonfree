import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class Class47 implements Interface13 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	public final int anInt10344;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!ada;")
	public final Class7 aClass7_11;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	public final int anInt10347;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!oe;")
	public final Class249 aClass249_14;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
	public final int anInt10343;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(ILclient!ada;Lclient!oe;II)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class249 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10344 = arg3;
		this.aClass7_11 = arg1;
		this.anInt10347 = arg4;
		this.aClass249_14 = arg2;
		this.anInt10343 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!of;")
	@Override
	public Class251 method8737() {
		return Static202.aClass251_2;
	}
}
