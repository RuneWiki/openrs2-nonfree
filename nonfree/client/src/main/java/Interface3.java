import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public interface Interface3 extends Interface5 {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	boolean method2578(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)Z")
	boolean method3135();

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)Z")
	boolean method2580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method3136();

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
	void method3138();
}
