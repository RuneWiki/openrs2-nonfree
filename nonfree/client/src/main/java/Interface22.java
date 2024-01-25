import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public interface Interface22 extends Interface13 {

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	void method7572();

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BII)Z")
	boolean method1387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZLclient!jaclib/memory/Source;)Z")
	boolean method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method1389();

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)Z")
	boolean method1390();
}
