import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public interface Interface13 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
	int method4051();

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)I")
	int method4052();

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([BIIZ)V")
	void method4053(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)J")
	long method4054();
}
