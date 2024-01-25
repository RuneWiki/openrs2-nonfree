import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class253 implements Interface27 {

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!uh;[IIJ)Ljava/lang/String;")
	@Override
	public String method6040(@OriginalArg(0) Class352 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == Static270.aClass352_6) {
			@Pc(13) Class61 local13 = Static202.aClass172_1.method3783(arg1[0]);
			return local13.method1493((int) arg2);
		} else if (arg0 == Static434.aClass352_9 || Static315.aClass352_7 == arg0) {
			@Pc(35) Class27 local35 = Static175.aClass247_2.method5962((int) arg2);
			return local35.aString9;
		} else if (arg0 == Static641.aClass352_15 || Static440.aClass352_10 == arg0 || arg0 == Static348.aClass352_8) {
			return Static202.aClass172_1.method3783(arg1[0]).method1493((int) arg2);
		} else {
			return null;
		}
	}
}
