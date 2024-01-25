import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class Class227 implements Interface3 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "I")
	public final int anInt5833;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "I")
	public final int anInt5837;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "I")
	public final int anInt5832;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "Lclient!taa;")
	public final Class352 aClass352_9;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "Lclient!lea;")
	public final Class223 aClass223_9;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(ILclient!lea;Lclient!taa;II)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class352 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5833 = arg3;
		this.anInt5837 = arg4;
		this.anInt5832 = arg0;
		this.aClass352_9 = arg2;
		this.aClass223_9 = arg1;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Lclient!vf;")
	@Override
	public Class390 method7510() {
		return Static133.aClass390_5;
	}
}
