import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class Class129 implements Interface13 {

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "Lclient!le;")
	public final Class204 aClass204_6;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
	public final int anInt3269;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "I")
	public final int anInt3276;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "Lclient!qj;")
	public final Class288 aClass288_7;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "I")
	public final int anInt3271;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(ILclient!le;Lclient!qj;II)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) Class288 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass204_6 = arg1;
		this.anInt3269 = arg3;
		this.anInt3276 = arg0;
		this.aClass288_7 = arg2;
		this.anInt3271 = arg4;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)Lclient!mha;")
	@Override
	public Class228 method8022() {
		return Static159.aClass228_2;
	}
}
