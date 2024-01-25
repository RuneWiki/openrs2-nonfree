import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public interface Interface3 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!wga;)V")
	void method8137(@OriginalArg(1) Class385 arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	void method8138();
}
