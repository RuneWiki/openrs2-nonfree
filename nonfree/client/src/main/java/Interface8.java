import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public interface Interface8 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BI)V")
	void method1847(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ig;)V")
	void method1848(@OriginalArg(0) Class91 arg0);

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Lclient!ig;)V")
	void method1849(@OriginalArg(0) Class91 arg0);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "()I")
	int method2573();

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(Lclient!ig;)V")
	void method1850(@OriginalArg(0) Class91 arg0);

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(Lclient!ig;)V")
	void method1851(@OriginalArg(0) Class91 arg0);
}
