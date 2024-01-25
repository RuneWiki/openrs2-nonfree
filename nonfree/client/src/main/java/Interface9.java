import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public interface Interface9 extends Interface6 {

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7613();

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
	void method7609();

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
	void method7607(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)Lclient!vp;")
	Class308 method3626();

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "(I)Z")
	boolean method7614();
}
