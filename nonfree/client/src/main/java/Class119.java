import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class Class119 implements Interface9 {

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	public final int anInt10375;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	public final int anInt10370;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public final int anInt10373;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!jn;")
	public final Class183 aClass183_12;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public final int anInt10374;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public final int anInt10367;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public final int anInt10369;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!nha;")
	public final Class245 aClass245_14;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	public final int anInt10371;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!nha;Lclient!jn;IIIIIII)V")
	public Class119(@OriginalArg(0) Class245 arg0, @OriginalArg(1) Class183 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt10375 = arg2;
		this.anInt10370 = arg7;
		this.anInt10373 = arg5;
		this.aClass183_12 = arg1;
		this.anInt10374 = arg3;
		this.anInt10367 = arg6;
		this.anInt10369 = arg8;
		this.aClass245_14 = arg0;
		this.anInt10371 = arg4;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lclient!vj;")
	@Override
	public Class365 method9019() {
		return null;
	}
}
