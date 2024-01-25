import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class225 implements Interface10 {

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "Lclient!vea;")
	public final Class368 aClass368_8;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
	public final int anInt6153;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
	public final int anInt6154;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
	public final int anInt6147;

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
	public final int anInt6155;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
	public final int anInt6151;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
	public final int anInt6149;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "Lclient!lk;")
	public final Class219 aClass219_8;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "Z")
	public final boolean aBoolean456;

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
	public final int anInt6150;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
	public final int anInt6148;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(ILclient!lk;Lclient!vea;IIIIIIIZ)V")
	public Class225(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class368 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aClass368_8 = arg2;
		this.anInt6153 = arg8;
		this.anInt6154 = arg9;
		this.anInt6147 = arg3;
		this.anInt6155 = arg5;
		this.anInt6151 = arg0;
		this.anInt6149 = arg4;
		this.aClass219_8 = arg1;
		this.aBoolean456 = arg10;
		this.anInt6150 = arg6;
		this.anInt6148 = arg7;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Lclient!vaa;")
	@Override
	public Class361 method8585() {
		return Static71.aClass361_6;
	}
}
