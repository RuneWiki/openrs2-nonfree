import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class Class31 implements Interface10 {

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public final int anInt9302;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public final int anInt9301;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	public final int anInt9299;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public final int anInt9306;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public final int anInt9298;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!lk;")
	public final Class219 aClass219_12;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public final int anInt9300;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public final int anInt9305;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!vea;")
	public final Class368 aClass368_11;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!lk;Lclient!vea;IIIIIII)V")
	public Class31(@OriginalArg(0) Class219 arg0, @OriginalArg(1) Class368 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9302 = arg5;
		this.anInt9301 = arg4;
		this.anInt9299 = arg7;
		this.anInt9306 = arg8;
		this.anInt9298 = arg2;
		this.aClass219_12 = arg0;
		this.anInt9300 = arg3;
		this.anInt9305 = arg6;
		this.aClass368_11 = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lclient!vaa;")
	@Override
	public Class361 method8585() {
		return null;
	}
}
