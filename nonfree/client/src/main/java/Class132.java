import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class Class132 implements Interface3 {

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
	public final int anInt10373;

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
	public final int anInt10382;

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
	public final int anInt10378;

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
	public final int anInt10383;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
	public final int anInt10374;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "Lclient!tda;")
	public final Class346 aClass346_14;

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
	public final int anInt10377;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "Lclient!jk;")
	public final Class189 aClass189_13;

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
	public final int anInt10380;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!jk;Lclient!tda;IIIIIII)V")
	public Class132(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt10373 = arg6;
		this.anInt10382 = arg3;
		this.anInt10378 = arg8;
		this.anInt10383 = arg7;
		this.anInt10374 = arg5;
		this.aClass346_14 = arg1;
		this.anInt10377 = arg4;
		this.aClass189_13 = arg0;
		this.anInt10380 = arg2;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)Lclient!wh;")
	@Override
	public Class392 method8802() {
		return null;
	}
}
