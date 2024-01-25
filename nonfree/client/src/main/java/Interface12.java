import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public interface Interface12 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
	void method9257();

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!vea;I)V")
	void method9258(@OriginalArg(0) Class384 arg0);
}
