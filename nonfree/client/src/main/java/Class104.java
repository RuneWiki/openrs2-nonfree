import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class Class104 implements Interface3 {

	@OriginalMember(owner = "client!la", name = "i", descriptor = "I")
	public final int anInt8375;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	public final int anInt8366;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public final int anInt8371;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	public final int anInt8368;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	public final int anInt8367;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!lea;")
	public final Class223 aClass223_11;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!taa;")
	public final Class352 aClass352_11;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public final int anInt8370;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public final int anInt8365;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!lea;Lclient!taa;IIIIIII)V")
	public Class104(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8375 = arg6;
		this.anInt8366 = arg3;
		this.anInt8371 = arg4;
		this.anInt8368 = arg2;
		this.anInt8367 = arg5;
		this.aClass223_11 = arg0;
		this.aClass352_11 = arg1;
		this.anInt8370 = arg8;
		this.anInt8365 = arg7;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Lclient!vf;")
	@Override
	public Class390 method7510() {
		return null;
	}
}
