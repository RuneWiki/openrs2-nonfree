import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class Class102 implements Interface1 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "Lclient!kfa;")
	public final Class178 aClass178_6;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!gq;")
	public final Class117 aClass117_6;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
	public final int anInt3827;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public final int anInt3822;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public final int anInt3823;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(ILclient!gq;Lclient!kfa;II)V")
	public Class102(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass178_6 = arg2;
		this.aClass117_6 = arg1;
		this.anInt3827 = arg3;
		this.anInt3822 = arg4;
		this.anInt3823 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)Lclient!qi;")
	@Override
	public Class275 method8059() {
		return Static446.aClass275_7;
	}
}
