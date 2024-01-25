import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public interface Interface25 extends Interface2 {

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	boolean method2906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2);

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)Z")
	boolean method2907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)V")
	void method2921();

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)Z")
	boolean method2908();

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method2909();
}
