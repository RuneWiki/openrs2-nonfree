import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class Class72 implements Interface25 {

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
	public final int anInt2969;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public final int anInt2966;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Lclient!ee;")
	public final Class79 aClass79_6;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!haa;")
	public final Class127 aClass127_7;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
	public final int anInt2968;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(ILclient!ee;Lclient!haa;II)V")
	public Class72(@OriginalArg(0) int arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2969 = arg4;
		this.anInt2966 = arg0;
		this.aClass79_6 = arg1;
		this.aClass127_7 = arg2;
		this.anInt2968 = arg3;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Lclient!hda;")
	@Override
	public Class129 method8540() {
		return Static493.aClass129_7;
	}
}
