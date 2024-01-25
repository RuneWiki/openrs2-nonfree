import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class Class63 implements Interface10 {

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!vea;")
	public final Class368 aClass368_4;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!lk;")
	public final Class219 aClass219_4;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public final int anInt1110;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public final int anInt1111;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	public final int anInt1113;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ILclient!lk;Lclient!vea;II)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class368 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass368_4 = arg2;
		this.aClass219_4 = arg1;
		this.anInt1110 = arg4;
		this.anInt1111 = arg0;
		this.anInt1113 = arg3;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lclient!vaa;")
	@Override
	public Class361 method8585() {
		return Static16.aClass361_1;
	}
}
