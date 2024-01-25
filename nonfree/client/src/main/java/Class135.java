import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class Class135 implements Interface12 {

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
	public final int anInt10395;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
	public final int anInt10390;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
	public final int anInt10393;

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "Lclient!eha;")
	public final Class97 aClass97_16;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!oea;")
	public final Class252 aClass252_12;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(ILclient!eha;Lclient!oea;II)V")
	public Class135(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class252 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10395 = arg3;
		this.anInt10390 = arg0;
		this.anInt10393 = arg4;
		this.aClass97_16 = arg1;
		this.aClass252_12 = arg2;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Lclient!hm;")
	@Override
	public Class151 method8831() {
		return Static481.aClass151_9;
	}
}
