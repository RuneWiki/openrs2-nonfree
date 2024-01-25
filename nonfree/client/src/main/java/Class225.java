import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class Class225 implements Interface14 {

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
	public final int anInt6158;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!kka;")
	public final Class205 aClass205_11;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public final int anInt6159;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public final int anInt6156;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!nv;")
	public final Class258 aClass258_7;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(ILclient!nv;Lclient!kka;II)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6158 = arg3;
		this.aClass205_11 = arg2;
		this.anInt6159 = arg0;
		this.anInt6156 = arg4;
		this.aClass258_7 = arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Lclient!c;")
	@Override
	public Class51 method9393() {
		return Static191.aClass51_13;
	}
}
