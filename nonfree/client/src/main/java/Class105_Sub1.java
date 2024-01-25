import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class105_Sub1 extends Class105 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!rv;)Lclient!rv;")
	@Override
	public Class1_Sub8_Sub14 method2477(@OriginalArg(1) Class1_Sub8_Sub14 arg0) {
		return new Class1_Sub8_Sub14_Sub2(arg0.method7008(), arg0.anInt8693);
	}
}
