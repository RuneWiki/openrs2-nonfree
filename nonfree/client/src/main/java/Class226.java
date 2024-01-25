import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class Class226 implements Interface27 {

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public final int anInt6815;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "Lclient!fe;")
	public final Class103 aClass103_7;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "Lclient!mp;")
	public final Class236 aClass236_7;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
	public final int anInt6814;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public final int anInt6813;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(ILclient!mp;Lclient!fe;II)V")
	public Class226(@OriginalArg(0) int arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6815 = arg3;
		this.aClass103_7 = arg2;
		this.aClass236_7 = arg1;
		this.anInt6814 = arg4;
		this.anInt6813 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Lclient!hl;")
	@Override
	public Class148 method9592() {
		return Static266.aClass148_13;
	}
}
